package cn.tx;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * 定义一个玩家
 */
public class Player extends KeyAdapter {

    GameFrame frame;

    public Player(GameFrame frame) {
        this.frame = frame;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        // 上38 下40 左37 右39
        switch (keyCode){
            case 38:
                frame.heroPlane.up=true;
                break;
            case 40:
                frame.heroPlane.down=true;
                break;
            case 37:
                frame.heroPlane.left=true;
                break;
            case 39:
                frame.heroPlane.right=true;
                break;
            case 66:
                addBullet();
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        // 上38 下40 左37 右39
        switch (keyCode){
            case 38:
                frame.heroPlane.up=false;
                break;
            case 40:
                frame.heroPlane.down=false;
                break;
            case 37:
                frame.heroPlane.left=false;
                break;
            case 39:
                frame.heroPlane.right=false;
                break;
        }

    }

    //装弹
    public void addBullet(){
        frame.bullets.add(new Bullet(frame.heroPlane.x+5,frame.heroPlane.y-20));
    }

}
