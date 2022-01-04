package com.inheritence.exercise;

import java.sql.SQLOutput;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-04
 * Time: 12:03
 */
public class exercise01 {
    public static void main(String[] args) {
        B b = new B();
    }
}
class A{
    A(){
        System.out.println("a");
    }
    A(String name){
        System.out.println("a name");
    }
}
class B extends A{
    B(){
        this("abc");
        System.out.println("b");
    }
    B(String name){
        //super();//默认调用了父类的构造器
        System.out.println("b name");
    }
}