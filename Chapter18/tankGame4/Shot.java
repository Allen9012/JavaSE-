package com.tankGame4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-02-06
 * Time: 20:19
 */
public class Shot implements Runnable {
    int x;
    int y;
    int direct = 0;//bullet direction
    int speed = 2;//bullet speed
    boolean isLive = true;//bullet is alive

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //basic on direction
            switch (direct) {
                case 0:
                    y -= speed;
                    break;
                case 1:
                    x += speed;
                    break;
                case 2:
                    y += speed;
                    break;
                case 3:
                    x -= speed;
                    break;
            }
            //test
            System.out.println("x= " + x + " " + "y= " + y);
            //when reach edge then destroy the thread
            //when bullet reach enemy we also should exit the thread
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive)) {
                System.out.println("子弹线程退出");
                isLive = false;
                break;
            }
        }
    }

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }
}
