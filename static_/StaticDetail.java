package com.HigherOrder.static_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-14
 * Time: 18:44
 */
public class StaticDetail {
    public static void main(String[] args) {
        B b=new B();
        System.out.println(B.n2);
        C c = new C();
        System.out.println(c.address);
    }
}
class B{
    public int n1=100;
    public static int n2=290;
}
class C {
    public static String address = "北京";
}