package cn.tx;

import javax.swing.*;
import java.awt.*;

public class EnemyPlane extends Thread{
    public GameFrame gf;

    public int x,y;
    public int width = 50,height = 50;
    public int speed = 2;
    public Image img = new ImageIcon("img/EnemyPlane.jpg").getImage();


    public EnemyPlane(int x, int y,GameFrame gf) {
        super();
        this.gf = gf;
        this.x = x;
        this.y = y;

    }
    public EnemyPlane(GameFrame gf, int x, int y, int width, int height) {
        super();
        this.gf = gf;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            //向左走
                //碰撞到了
            if(hit()){
                System.out.println("hit.......");
                this.speed = 0;
                this.img = new ImageIcon("img/boom.jpg").getImage();

                try {
                    this.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gf.enemyPlanes.remove(this);
                break;
            }

            if (this.y>890){
                break;
            }
            try {
                this.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //检测碰撞
    public boolean hit(){
        Rectangle myrect = new Rectangle(this.x,this.y,this.width,this.height);

        Rectangle rect = null;

        for (int i = 0; i < gf.bullets.size(); i++) {
            Bullet bullet = gf.bullets.get(i);
            System.out.println("test hit");
            rect = new Rectangle(bullet.x,bullet.y-1,bullet.width,bullet.height);
            //碰撞检测
            if (myrect.intersects(rect)){
                return true;
            }

        }
        return false;
    }






}

