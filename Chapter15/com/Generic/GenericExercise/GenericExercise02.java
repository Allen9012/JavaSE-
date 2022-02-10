package com.Generic.GenericExercise;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-28
 * Time: 21:57
 */
public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(20000, "mary", new Employee.Mydate(2, 10, 2000)));
        employees.add(new Employee(20000, "jack", new Employee.Mydate(2, 12, 2000)));
        employees.add(new Employee(20000, "mary", new Employee.Mydate(2, 12, 2000)));
        System.out.println("employees=" + employees);

        System.out.println("===对员工进行排序===");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {

                //先对参数传入的验证，不能为空
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)) {
                    System.out.println("类型不正确...");
                    return 0;
                }
                //先按照name 排序，如果name 相同，则按生日日期的先后排序。【即：定制排序】
                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0) {
                    return i;
                }
                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }
        });
        System.out.println("employees=" + employees);

    }
}

class Employee {
    private int sal;
    private String name;
    private Mydate Birthday;

    public Employee(int sal, String name, Mydate birthday) {
        this.sal = sal;
        this.name = name;
        Birthday = birthday;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mydate getBirthday() {
        return Birthday;
    }

    public void setBirthday(Mydate birthday) {
        Birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "sal=" + sal +
                ", name='" + name + '\'' +
                ", Birthday=" + Birthday +
                '}';
    }
    static class Mydate implements Comparable<Mydate>{
        private int month;
        private int day;
        private int year;

        public Mydate(int month, int day, int year) {
            this.month = month;
            this.day = day;
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return
                    "month=" + month +
                            ", day=" + day +
                            ", year=" + year
                    ;
        }

        @Override
        public int compareTo(Mydate o) {

            int yearMinus = year-o.getYear();
            if (yearMinus != 0) {
                return yearMinus;
            }
            int monthMinus = month-o.getMonth();
            if (monthMinus != 0) {
                return monthMinus;
            }
            return day-o.getDay();
        }
    }
}
