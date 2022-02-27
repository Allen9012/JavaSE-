package com.tankGame3;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-31
 * Time: 13:48
 */
public class HspTankGame03 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args)  {
        HspTankGame03 hspTankGame03 = new HspTankGame03();
    }

    public HspTankGame03(){
        mp=new MyPanel();
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);//绘图区
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
