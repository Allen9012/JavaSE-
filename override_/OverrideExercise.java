package com.ObjectMiddle.override_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-06
 * Time: 10:36
 */
public class OverrideExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack",15);
        System.out.println(jack.say());
        Student smith = new Student("smith", 20, 123546, 98);
        System.out.println(smith.say());
    }
}
