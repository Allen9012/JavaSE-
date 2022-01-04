package com.ObjectMiddle.polymorphic_.PolyParameter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-11
 * Time: 10:13
 */
public class Employee {
     private String name;
     private double salary;

     public Employee(String name, double salary) {
          this.name = name;
          this.salary = salary;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public double getSalary() {
          return salary;
     }

     public void setSalary(double salary) {
          this.salary = salary;
     }
     public double getAnnual(){
          return salary*12;
     }
}
