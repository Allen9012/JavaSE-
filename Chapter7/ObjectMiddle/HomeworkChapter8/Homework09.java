package com.ObjectMiddle.HomeworkChapter8;

public class Homework09 {
    public static void main(String[] args) {
        new LabeledPoint("Black",1929,230.07);
    }
}
class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
class LabeledPoint extends Point{

    private String label;

    public LabeledPoint( String label,double x, double y) {
        super(x, y);
        this.label = label;
    }
}