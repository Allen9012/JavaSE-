package com.Collection.list_;

import javax.smartcardio.ATR;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-22
 * Time: 9:32
 */
public class ListExercise02 {

    public static void main(String[] args) {
        //List list = new ArrayList();
        List list = new LinkedList();
//List list = new Vector();
        list.add(new Book("红楼梦", "曹雪芹", 100));
        list.add(new Book("西游记", "吴承恩", 10));
        list.add(new Book("水浒传", "施耐庵", 19));
        list.add(new Book("三国志", "罗贯中", 80));
//list.add(new Book("西游记", "吴承恩", 10));
        for (Object o : list) {
            System.out.println(o);
        }
sort(list);
        System.out.println("===after sort===");
        for (Object o :list) {
            System.out.println(o);
        }

    }

    public static void sort(List list) {
        //遍历比较
        int listSize=list.size();
        for (int i = 0; i <listSize -1; i++) {
            for (int j = 0; j <listSize-1-i ; j++) {
                //get the obj
                Book book1=(Book)list.get(j);
                Book book2=(Book)list.get(j+1);
                if(book1.getPrice()>book2.getPrice()){
                    //directly use list method set
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }

}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}