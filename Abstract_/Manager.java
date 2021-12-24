package com.HigherOrder.Abstract_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-15
 * Time: 18:26
 */
public class Manager extends Employee{
    private double bonus;

    public Manager(String name, int id, double salary) {
        super(name, id, salary);

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("manager "+getName()+" is working");
    }
}
