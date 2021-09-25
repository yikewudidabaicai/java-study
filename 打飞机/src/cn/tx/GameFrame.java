package cn.tx;


import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.Vector;

public class GameFrame extends JFrame {

    HeroPlane heroPlane;

    //定义子弹的集合  并发处理的集合 对线程安全的集合
    Vector<Bullet> bullets = new Vector<>();
    //敌机集合
    Vector<EnemyPlane> enemyPlanes = new Vector<>();

    GameFrame frame;

    public GameFrame(){
        frame = this;
        //创建英雄飞机

        heroPlane = new HeroPlane();
        heroPlane.start();
        //窗口大小
        this.setSize(500,890);
        //标题
        this.setTitle("打飞机");
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //窗口可见
        this.setVisible(true);

        //启动一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                //还原撤销热键为 ctrl+shift+z
                while (true){
                    repaint();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();

        //产生敌机的线程
        new Thread(new Runnable() {
            Random r = new Random();

            @Override
            public void run() {
                while (true){
                    EnemyPlane a = new EnemyPlane(r.nextInt(500),0,frame);
                    a.start();
                    enemyPlanes.add(a);

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();
    }


    /**
     * 在窗口上画，内容，paint这个画笔的方法在窗口初始化的时候就会默认执行
     * @param g
     */
    public void paint(Graphics g){
        System.out.println("绘制画板");
        //画背景
        BufferedImage image = (BufferedImage) this.createImage(this.getSize().width,this.getSize().height);
        //高校缓存的画笔
        Graphics bi = image.getGraphics();

        //画上背景图片
        bi.drawImage(new ImageIcon("img/bj_level1.jpg").getImage(),0,0,null);
        //画战斗机
        bi.drawImage(heroPlane.img, heroPlane.x, heroPlane.y,heroPlane.width,heroPlane.height,null);
        //飞机发飙，发子弹，画子弹
        for (int i = 0; i < bullets.size(); i++) {
            Bullet bullet = bullets.get(i);
            if (bullet.y>0)
            bi.drawImage(bullet.image, bullet.x, bullet.y-=bullet.speed,bullet.width,bullet.height,null);
            else
                bullets.remove(bullet);
        }
        //画敌机
        for (int i = 0; i < enemyPlanes.size(); i++) {
            EnemyPlane ep = enemyPlanes.get(i);
            if (ep.y<890)
                bi.drawImage(ep.img, ep.x, ep.y+=ep.speed,ep.width,ep.height,null);
            else
                enemyPlanes.remove(ep);
        }


        //生效
        g.drawImage(image,0,0,null);

    }

    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
        Player player = new Player(frame);
        frame.addKeyListener(player);

    }

}
