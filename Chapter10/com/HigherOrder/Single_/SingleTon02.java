package com.HigherOrder.Single_;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.xml.bind.PrintConversionEvent;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-07
 * Time: 18:23
 */
public class SingleTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);
  //call again will it create a new object?
        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);
        System.out.println(instance1==instance);
    }
}

//we hope that when the code is executing ,we can only raise one cat
// we also use single instance
//步驟
//1.仍然構造器私有化
//2.定義一個static 靜態屬性對象
//3.提供一個public 的static 方法，可以返回一個Cat 對象
//4.懶漢式，只有當用戶使用getInstance 時，才返回cat 對象, 後面再次調用時，會返回上次創建的cat 對象
// 從而保證了單例
class Cat {
    private String name;
    private static Cat cat;//直接new 是饿汉式
public static int n1=999;

    private Cat(String name) {
        System.out.println("构造器被调用，说明对象被实例化");
        this.name = name;
    }
    public  static Cat getInstance(){
        if(cat==null){
             cat=new Cat("cute");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}