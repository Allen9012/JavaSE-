package com.ObjectMiddle.HomeworkChapter8;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-13
 * Time: 9:02
 */
public class Clerk {
    private String name;
    private double daySal;
    private int workDays;
    private double grade;

    public Clerk(String name, double daySal, int workDays, double grade) {
        this.name = name;
        this.daySal = daySal;
        this.workDays = workDays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printSal() {
        System.out.println(name + " 工资=" + daySal * workDays * grade);
    }

}
