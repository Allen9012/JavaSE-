package com.ObjectMiddle.HomeworkChapter7;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-11-28
 * Time: 14:52
 */
public class Homework05 {
    public static void main(String[] args) {
        Circle circle = new Circle(20);
        double aera=circle.area();
        double Perimeter= circle.Perimeter();
        System.out.println("aera="+aera);
        System.out.println("Perimeter="+Perimeter);
    }
}
class Circle{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double Perimeter(){
        return 2*Math.PI*radius;
    }
}