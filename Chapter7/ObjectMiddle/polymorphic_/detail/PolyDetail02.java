package com.ObjectMiddle.polymorphic_.detail;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-09
 * Time: 20:52
 */
public class PolyDetail02 {
    public static void main(String[] args) {
        Base base = new Base();
        System.out.println(base.count);
        Sub sub = new Sub();
        System.out.println(sub.count);
    }
}
class Base{//父类
    int count =10;
}
class Sub extends Base{//子类
    int count =20;//属性
}

