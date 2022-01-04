package com.ObjectMiddle.polymorphic_.dynamic;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-10
 * Time: 22:42
 */
public class DynamicBinding {
    public static void main(String[] args) {
        //a 的编译类型A, 运行类型B
        A a = new B();//向上转型
        System.out.println(a.sum());//?40 -> 30
        System.out.println(a.sum1());//?30-> 20
    }
}
class A {//父类
    public int i = 10;
    //动态绑定机制:
    //属性是没有动态绑定机制的直接执行，方法是有的
    //当调用对象的时候，会和运行类型绑定，也就是说去找B的sum，找不到就去找父类的sum，但是父类的sum运行时
    //有两个getI方法，这里会调用运行时绑定类型的，也就是B的
    public int sum() {//父类sum()
        return getI() + 10;//20 + 10
    }
    public int sum1() {//父类sum1()
        return i + 10;//10 + 10
    }
    public int getI() {//父类getI
        return i;
    }
}
class B extends A {//子类
    public int i = 20;
    // public int sum() {
// return i + 20;
// }
    public int getI() {//子类getI()
        return i;
    }
// public int sum1() {
// return i + 10;
// }
}