package com.ObjectMiddle.HomeworkChapter8;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-13
 * Time: 9:06
 */
public class Manager extends Clerk{
    private double bonus;
/*when create the manager object,we don't know the exact num,
 so we don't set bonus in constructor*/
    public Manager(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void printSal() {
            //因为经理的工资计算方式和Employee不一样，所以我们重写
            System.out.println("经理 " + getName() + " 工资是="
                    + (bonus + getDaySal() * getWorkDays() * getGrade()));
        }
}
