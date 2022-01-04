package com.ObjectMiddle.polymorphic_.detail;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-09
 * Time: 20:02
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("cat eats fish");
    }
    public void catchMouse(){//cat特有
        System.out.println("猫抓老鼠");
    }

}
