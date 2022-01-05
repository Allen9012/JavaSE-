package com.HigherOrder.InnerClass;


public class InnerClassExercise01 {
    public static void main(String[] args) {

        //1. 当做实参直接传递，简洁高效
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一副名画~~...");
            }
        });
        //2. 传统方法
        f1(new Picture());

    }

    //静态方法,形参是接口类型
    public static void f1(IL il) {
        il.show();
    }
}
//接口
interface IL {
    void show();
}
//类->实现IL => 编程领域 (硬编码),这个方法不是很好，改了一个都改了，但是内部类不是这样
class Picture implements IL {

    @Override
    public void show() {
        System.out.println("这是一副名画XX...");
    }
}

