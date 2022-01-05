package com.HigherOrder.InnerClass;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-20
 * Time: 9:32
 */
public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.fi();
    }
}

class Outer05 {
    private int n1 = 99;

    public void fi() {
        //create an anonymous inner class based on class
        Person p = new Person() {
            public void hi() {
                System.out.println("匿名内部类重写了hi()方法");
            }
        };
        p.hi();//dynamic binding,operating type is Outer05$1

        // we also can call it directly
        new Person(){
            public void hi(){
                System.out.println("匿名内部类重写了hi方法haha");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("jack");//call object`
    }
}

class Person {
    public void hi() {
        System.out.println("Person hi()");
    }
    public void ok(String str){
        System.out.println("Person ok() "+str);
    }
}