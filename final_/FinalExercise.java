package com.HigherOrder.final_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-15
 * Time: 17:10
 */
public class FinalExercise {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("面积=" + circle.calArea());
    }
}

class Circle {
    private double radius;
    private final double PI;// = 3.14;

    //构造器
    public Circle(double radius) {
        this.radius = radius;
//PI = 3.14;

    }

    {
        PI = 3.14;
    }

    public double calArea() {
        return PI * radius * radius;
    }
}