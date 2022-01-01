package com.Exception_.exception_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-17
 * Time: 14:44
 */
public class ClassCastException_ {
    public static void main(String[] args) {
        A b = new B(); //向上转型
        B b2 = (B)b;//向下转型，这里是OK
        C c2 = (C)b;//这里抛出ClassCastException
    }
}
class A {}
class B extends A {}
class C extends A {}