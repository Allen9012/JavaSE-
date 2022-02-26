package com.Homework;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-17
 * Time: 16:50
 */
public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        B b = new B(a);
        b.start();
    }
}

//create thread A
class A extends Thread {
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    public void run() {
        while (loop) {
            System.out.println((int) (Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    private A a;
    private Scanner scanner = new Scanner(System.in);

    public B(A a) {//构造器中直接传入A类对象,才能控制
        this.a = a;
    }

    public void run() {
        //接受用户的输入
        while (true) {
            System.out.println("please enter in q exit");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                a.setLoop(false);
                System.out.println("B退出");
                break;
            }
        }
    }

    public void setA(A a) {
        this.a = a;
    }
}