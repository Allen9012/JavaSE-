package com.TankGame;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-31
 * Time: 13:46
 */
public class MyPanel extends JPanel {
    //define my tank

    Hero hero = null;

    public MyPanel() {
        hero = new Hero(100, 100);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        drawTank(hero.getX(), hero.getY(), g, 0, 0);
        drawTank(hero.getX()+60, hero.getY(), g, 0, 1);

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
            case 0: //hero
                g.setColor(Color.cyan);
                break;
            case 1:  //enemy
                g.setColor(Color.yellow);
                break;

        }
        //跟据方向绘制坦克
        switch (direct) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            default:
                System.out.println("暂时没处理");
        }

    }
}
