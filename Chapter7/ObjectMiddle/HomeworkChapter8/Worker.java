package com.ObjectMiddle.HomeworkChapter8;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-13
 * Time: 9:15
 */
public class Worker extends Clerk{
    public Worker(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }
    public void printSal(){
        System.out.print("worker ");
        super.printSal();
    }
}
