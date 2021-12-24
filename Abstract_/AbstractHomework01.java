package com.HigherOrder.Abstract_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-15
 * Time: 18:23
 */
public class AbstractHomework01 {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", 007, 30000);
        jack.setBonus(8000);
        jack.work();
        Worker tom = new Worker("tom", 888, 20000);
        tom.work();
    }
}
