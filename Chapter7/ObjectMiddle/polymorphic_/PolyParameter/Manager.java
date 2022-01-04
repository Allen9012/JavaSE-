package com.ObjectMiddle.polymorphic_.PolyParameter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-11
 * Time: 10:29
 */
public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println("经理 "+getName()+" is managing");
    }
    public double getAnnual(){
        return super.getAnnual()+getBonus();
    }
}
