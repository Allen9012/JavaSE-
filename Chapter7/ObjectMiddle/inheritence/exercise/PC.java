package com.inheritence.exercise;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-04
 * Time: 15:40
 */
public class PC extends Computer{
     private String brand;
     public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("PC信息=");
        System.out.println(getDetails()+" brand="+brand);
    }
}
