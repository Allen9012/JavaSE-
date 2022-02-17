package com.TankGame;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-31
 * Time: 13:48
 */
public class HspTankGame01 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args)  {
        HspTankGame01 hspTankGame01 = new HspTankGame01();
    }

    public HspTankGame01(){
        mp=new MyPanel();
        this.add(mp);//绘图区
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
