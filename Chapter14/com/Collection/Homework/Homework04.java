package com.Collection.Homework;

import com.Collection.Set.TreeSet_;

import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-15
 * Time: 17:44
 */
public class Homework04 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("hsp");
        treeSet.add("tom");
        treeSet.add("hsp");//本质上还是一个comparator 接口
    }
}
