package com.ObjectMiddle.polymorphic_.detail;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-09
 * Time: 20:04
 */
public class PolyDetail {
    public static void main(String[] args) {
        //父类的引用指向子类的对象
        //向上转型
        Animal animal =new Cat();
        //1.可以调用父类的所有成员
        //2.但是不能调用子类的特有成员
        //> 因为在编译阶段，能调用那些成员是由编译类型决定的
        //3.这说明了最终运行的时候看的是子类的具体效果从子类开始查找方法
        animal.eat();//输出了猫的方法
        animal.run();
        animal.show();
        animal.sleep();

        //希望可以调用cat的catchmouse方法
        //可以用向下转型
        //此时的编译类型--》Cat  运行类型--》Cat
        Cat cat=(Cat)animal;
        cat.catchMouse();


        //2.要求animal原来指向的是猫
        //让一只狗是不可能强转成一只猫
        Dog dog =(Dog) animal;//不可以
        System.out.println("ok");
    }
}
