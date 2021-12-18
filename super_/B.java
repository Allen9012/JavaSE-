package com.super_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-06
 * Time: 8:36
 */
public class B extends A{
    public void hi(){
        System.out.println(super.n1+" "+super.n2+" "+super.n3);
    }
    public void ok(){
        super.test100();
        super.test200();
        super.test300();
        //super.test400();//不能访问父类private方法
    }
    //访问父类的构造器，super(参数列表)，只能放在构造器的第一句，只能出现一句
    public B(){
//        super("jack",10);
//        super();
        super("jack");
    }
    public void cal(){
        System.out.println("B类的cal方法");
    }
    public void sum(){
        System.out.println("B类的sun（）");
        super.cal();//在A中找到
    }
}
