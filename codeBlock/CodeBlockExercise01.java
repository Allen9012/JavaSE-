package com.HigherOrder.codeBlock;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-15
 * Time: 11:28
 */
public class CodeBlockExercise01 {
    public static void main(String[] args) {
        System.out.println("total = "+ Person.total); //100
        System.out.println("total = "+ Person.total); //100
    }
}
class Person {
    public static int total;//静态变量
    static {//静态代码块
        total = 100;
        System.out.println("in static block!");//(1)
    }
}
