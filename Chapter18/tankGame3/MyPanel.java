package com.tankGame3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-31
 * Time: 13:46
 */

//为了让panel不停的重绘，需要将MyPanel实现Runnable接口
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //define my tank

    Hero hero = null;
    //定义敌人放到vector
    int enemySize = 3;
    Vector<Enemy> enemies = new Vector<>();

    public MyPanel() {
        hero = new Hero(100, 100);
        hero.setSpeed(3);
        //
        for (int i = 0; i < enemySize; i++) {
            Enemy enemy = new Enemy(100 * (i + 1), 0);
            enemy.setDirect(2);
            enemies.add(enemy);
        }

    }

    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        //画出自己的坦克
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
        //坦克多，而且多线程，所以要放到Vector中
        for (int i = 0; i < enemies.size(); i++) {
            //取出坦克
            Enemy enemy = enemies.get(i);
            drawTank(enemy.getX(), enemy.getY(), g, enemy.getDirect(), 0);
        }

        //画出hero射出的子弹
        if (hero.shot != null && hero.shot.isLive == true) {
            //g.fill3DRect(hero.shot.x,hero.shot.y,1,1,false);
            System.out.println("子弹被绘制...");
            g.draw3DRect(hero.shot.x, hero.shot.y, 2, 2, false);
        }


    }

    /**
     * @param x      坦克的左上角坐标
     * @param y      坦克的左上角坐标
     * @param g      画笔
     * @param direct 坦克方向
     * @param type   坦克类型
     */
    //要保证坦克的方向
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0: //enemy
                g.setColor(Color.cyan);
                break;
            case 1:  //my
                g.setColor(Color.yellow);
                break;

        }
        //跟据方向绘制坦克
        //direct表示方向(0上1向右2向左3向下)
        switch (direct) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
            default:
                System.out.println("暂时没处理");
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }


    //处理事件
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            //改变坦克的方向
            //还要修改坦克坐标
            hero.setDirect(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        }

        if (e.getKeyCode() == KeyEvent.VK_J) {
            System.out.println("J is pressed");
            hero.shotEnemyTank();
            //启动线程之后会进入该方法

        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    //子弹要看到要一直重绘这个panel才可以
    @Override
    public void run() {//每隔100ms要重绘区域
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.repaint();
        }
    }
}

