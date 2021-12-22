package com.HigherOrder.static_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-14
 * Time: 19:30
 */
public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi();
//can be call by class name
        /*D.say();*/
//can't be called by class name must new an object
    }
}

class D {
    public static int n1=100;
    int n2=200;
    public void say() {//not static

    }

    public static void hi() {//static one
        // System.out.println(this.n1);
    }
    public  static void hello(){
        System.out.println(D.n1);
        System.out.println(n1);
        //System.out.println(n2);
      //  say();
    }
    public void ok(){
        System.out.println(n1+n2);
        say();
        hello();
    }
}