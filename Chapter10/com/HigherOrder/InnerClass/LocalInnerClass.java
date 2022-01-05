package com.HigherOrder.InnerClass;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-17
 * Time: 11:38
 */


public class LocalInnerClass {
    public static void main(String[] args) {
//        new Outer02().m1();
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("Outer02 hashcode="+outer02);
    }
}

class Outer02 {
    private int n1 = 100;

    private void n2() {
        System.out.println("Outer n2()");
    }

    public void m1() {
        //通常定义在方法中
        class Inner02 {//局部内部类

            //1.局部内部类是定义在外部类的局部位置,通常在方法
            //3.不能添加访问修饰符,但是可以使用final 修饰,
            //4.作用域: 仅仅在定义它的方法或代码块中  f1()相当于局部方法，出了范围用不了
            //2.可以直接访问外部类的所有成员，包含私有的
            public void f1() {
                //5. 局部内部类可以直接访问外部类的成员，比如下面外部类n1 和m2()
                //7. 如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，
                // 使用外部类名.this.成员去访问
                // 老韩解读Outer02.this 本质就是外部类的对象, 即哪个对象调用了m1, Outer02.this 就是哪个对象
                System.out.println("n1=" + n1+" OuterClass n1="+Outer02.this.n1);//can access private properties
                System.out.println("Outer02.this.hashcode="+Outer02.this);//为了证明Outer02.this==Outer02
                n2();
            }
        }
        //6. 外部类在方法中，可以创建Inner02 对象，然后调用方法即可
        Inner02 inner02 = new Inner02();
        inner02.f1();
        /**
         * //这波要在方法内继承,可以继承，加了final不能继承
        class Inner03 extends Inner02{

        }*/
    }


}