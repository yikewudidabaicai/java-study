package cn.tx;

import javax.swing.*;
import java.awt.*;

public class HeroPlane extends Thread {
    //英雄机在画板行的位置
    int x = 230,y = 700;
    //英雄机大小
    int width = 50, height = 50;
    //英雄机移动速度
    int speed = 7;
    Image img = new ImageIcon("img/zdj1.jpg").getImage();

    //定义方向键的标志
    boolean up, down, left, right;

    public HeroPlane() {
    }

    public HeroPlane(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void run() {
        while (true){
            if(up){
                y-=speed;
            }
            if (down){
                y+=speed;
            }
            if (left){
                x-=speed;
            }
            if (right){
                x+=speed;
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
