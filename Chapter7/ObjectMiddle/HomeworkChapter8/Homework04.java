package com.ObjectMiddle.HomeworkChapter8;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-13
 * Time: 9:02
 */
public class Homework04 {
    public static void main(String[] args) {
        Manager manager = new Manager("刘备", 100, 20, 1.2);
//set bonus
        manager.setBonus(1000);
        manager.printSal();
        Worker worker = new Worker("关羽", 50, 10, 1.0);
        worker.printSal();
    }
}
