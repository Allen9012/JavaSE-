package com.inheritence;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-03
 * Time: 13:30
 */
public class Sub extends Base{//子类
    //当创建子类对象的时候，默认情况下会去调用父类的无参构造器
    public Sub(){//构造器
        super("jack",15);
        System.out.println("子类的Sub()构造器被调用....");
    }
    //当把无参构造器给注释掉换成有参构造器的时候，出现问题，必须指定一个
    public Sub(String name,int age){
        super("hsp");
        System.out.println("子类Sub(String name,int age)构造器被调用...");
    }
    public void sayOk(){//子类方法
        //父类的非private属性和方法都可以访问
        //非私有的属性和方法不可以访问
        //看看属性
        System.out.println(n1+" "+n2+" "+n3);//n4 不可以访问
        //看看方法
        test100();
        test200();
        test300();
        //test400();//不能访问
        System.out.println("n4="+getN4());
        callTest400();
    }
}
