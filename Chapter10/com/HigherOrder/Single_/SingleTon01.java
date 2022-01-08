package com.HigherOrder.Single_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-07
 * Time: 14:10
 */
public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        GirlFriend instance1 = GirlFriend.getInstance();
        System.out.println(instance1);
        System.out.println(instance==instance1);
    }
}
class GirlFriend {
    //为了能够在静态方法中，返回gf 对象，需要将其修饰为static
//對象，通常是重量級的對象, 餓漢式可能造成創建了對象，但是沒有使用.造成了浪费，懒汉式可以解决
    private String name;
    private static GirlFriend gf=new GirlFriend("red");
public static  int n1=100;//如果调用，则会顺带创建对象，
    //如何保障我们只能创建一个GirlFriend 对象
    //步骤[单例模式-饿汉式]
    //1. 将构造器私有化
    //2. 在类的内部直接创建对象(该对象是static)
    //3. 提供一个公共的static 方法，返回gf 对象
    public GirlFriend(String name) {
        System.out.println("constructor is called");
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}

