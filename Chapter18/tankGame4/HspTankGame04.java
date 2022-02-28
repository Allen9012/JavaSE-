package com.tankGame4;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-31
 * Time: 13:48
 */
public class HspTankGame04 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args)  {
        HspTankGame04 hspTankGame04 = new HspTankGame04();
    }

    public HspTankGame04(){
        mp=new MyPanel();
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);//绘图区
        this.setSize(1200,950);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
