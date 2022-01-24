package com.Collection.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-22
 * Time: 9:04
 */
public class ListExercise {
    public static void main(String[] args) {
        /*
添加10 个以上的元素(比如String "hello" )，在2 号位插入一个元素"韩顺平教育"，
获得第5 个元素，删除第6 个元素，修改第7 个元素，在使用迭代器遍历集合，
要求:使用List 的实现类ArrayList 完成。
        */

        List list=new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello"+i);
        }
        System.out.println("list="+list);
        list.add(2,"allen");
        System.out.println("list="+list);
        System.out.println("the fifth element is "+list.get(4));
        list.remove(5);
        System.out.println("list="+list);
        list.set(6,"be modified")       ;
        System.out.println("list="+list);

    }
}
