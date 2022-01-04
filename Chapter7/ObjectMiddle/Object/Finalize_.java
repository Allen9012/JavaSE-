package com.ObjectMiddle.Object;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-11
 * Time: 17:24
 */
public class Finalize_ {
    public static void main(String[] args) {
        Car car = new Car("BenZ");
        car=null;//now this car object is a trash ,and we need a finalize method
        System.gc();
        //we call this actively,and actually we don't always use this finalize method
        System.out.println("the programmer exits");
    }
}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }
//这时car 对象就是一个垃圾,垃圾回收器就会回收(销毁)对象, 在销毁对象前，会调用该对象的finalize 方法
//,程序员就可以在finalize 中，写自己的业务逻辑代码(比如释放资源：数据库连接,或者打开文件..)
//,如果程序员不重写finalize,那么就会调用Object 类的finalize, 即默认处理
//,如果程序员重写了finalize, 就可以实现自己的逻辑

    @Override
    protected void finalize() throws Throwable {
        System.out.println("we finalize the car "+name);
        System.out.println("we free some resources");
    }
}