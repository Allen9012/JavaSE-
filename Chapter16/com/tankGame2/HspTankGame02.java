package com.tankGame2;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-31
 * Time: 13:48
 */
public class HspTankGame02 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args)  {
        HspTankGame02 hspTankGame02 = new HspTankGame02();
    }

    public HspTankGame02(){
        mp=new MyPanel();
        this.add(mp);//绘图区
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
