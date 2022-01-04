package com.ObjectMiddle.polymorphic_.objectpoly;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-09
 * Time: 18:55
 */
public class Dog extends Animal{
    @Override
    public void cry() {
        System.out.println("Dog is crying");
    }
}
