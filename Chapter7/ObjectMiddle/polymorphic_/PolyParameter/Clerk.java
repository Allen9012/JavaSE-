package com.ObjectMiddle.polymorphic_.PolyParameter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-11
 * Time: 10:23
 */
public class Clerk extends Employee{
    public Clerk(String name, double salary) {
        super(name, salary);
    }
    public double getAnnual(){
        return super.getAnnual();
    }
    public void work(){
        System.out.println("普通员工 "+getName()+" 正在工作");
    }
}
