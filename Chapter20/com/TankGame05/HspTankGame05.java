package com.TankGame05;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-31
 * Time: 13:48
 */
public class HspTankGame05 extends JFrame {
    MyPanel mp = null;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)  {
        HspTankGame05 hspTankGame05 = new HspTankGame05();
    }

    public HspTankGame05(){
        System.out.println("请输入选择 1: 新游戏 2: 继续上局");
        String key = scanner.next();
        mp=new MyPanel(key);
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);//绘图区

        this.setSize(1350,1000);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        //在JFrame中z增加响应关闭窗口的处理
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.keepRecord();
                //System.out.println("听到了");
                System.exit(0);
            }
        });
    }
}
