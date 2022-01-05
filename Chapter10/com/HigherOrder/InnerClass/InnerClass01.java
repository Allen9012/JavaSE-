package com.HigherOrder.InnerClass;

import sun.applet.Main;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-17
 * Time: 11:32
 */
public class InnerClass01 {
    public static void main(String[] args) {

    }
}
class Outer{//outer class
    private int n1=100;
    public Outer(int  n1){//构造器
        this.n1=n1;
    }
    public void m1(){
        System.out.println("m1()");
    }
    {
        System.out.println("代码块......");
    }
    class Inner{//inner class

    }
}