package com.ObjectMiddle.HomeworkChapter7;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-11-28
 * Time: 14:29
 */
public class Homework03 {
    public static void main(String[] args) {
        Book book = new Book("mkadma",105);
        book.info();
        book.updatePrice();
        book.info();
    }
}
class Book{
    String name;
    double price;
    public Book(String name, double price){
        this.name = name;
        this.price= price;
    }
    public void updatePrice(){
        if(this.price>150){
            this.price=150;
        }else if(this.price>100){
            this.price=100;
        }
    }
    //显示书籍情况
    public void info(){
        System.out.println("书名"+this.name+"价格="+this.price);
    }
}