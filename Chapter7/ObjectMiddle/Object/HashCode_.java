package com.ObjectMiddle.Object;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-11
 * Time: 17:06
 */
public class HashCode_ {
    public static void main(String[] args) {
                AA aa = new AA();
                AA aa2 = new AA();
                AA aa3 = aa;
                //the point is that whether it is the same object
                System.out.println("aa.hashCode()=" + aa.hashCode());
                System.out.println("aa2.hashCode()=" + aa2.hashCode());
                System.out.println("aa3.hashCode()=" + aa3.hashCode());
            }
}
class AA {}