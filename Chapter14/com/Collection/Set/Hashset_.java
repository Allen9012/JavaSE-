package com.Collection.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-23
 * Time: 9:37
 */
public class Hashset_ {
    public static void main(String[] args) {
        //老韩解读
//1. 构造器走的源码
/*
public HashSet() {
map = new HashMap<>();
}
2. HashSet 可以存放null ,但是只能有一个null,即元素不能重复
*/
//      Set hashSet = new HashSet();
//        hashSet.add(null);
//        hashSet.add(null);
        TreeSet treeSet = new TreeSet();
        treeSet.add(null);


        System.out.println("hashSet=" + treeSet);
    }
}
