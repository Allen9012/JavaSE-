package com.HigherOrder.static_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-14
 * Time: 18:37
 */
public class VisitStatic {
    public static void main(String[] args) {
        System.out.println(A.name);
    }
}
class A{
    //we need to obey access rules
    public static String name="Learn Java";
}