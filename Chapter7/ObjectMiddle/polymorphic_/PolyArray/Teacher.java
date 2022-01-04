package com.ObjectMiddle.polymorphic_.PolyArray;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-10
 * Time: 23:02
 */
public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String say(){
        return "老师 "+super.say()+"salary= "+salary;
    }
    public void teach(){
        System.out.println("老师 "+getName()+"正在讲Java");
    }
}
