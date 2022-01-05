package com.HigherOrder.Interface_.Exercise;

import java.sql.SQLOutput;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-16
 * Time: 14:20
 */
public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.n1);
        System.out.println(A.n1);
        System.out.println(B.n1);
    }
}
interface A{
    int n1=10;
}
class B implements A{
}