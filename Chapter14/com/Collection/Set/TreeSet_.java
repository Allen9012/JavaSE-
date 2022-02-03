package com.Collection.Set;

import org.omg.CORBA.ARG_OUT;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-12
 * Time: 20:02
 */
public class TreeSet_ {

    //老韩解读
    //1. 当我们使用无参构造器，创建TreeSet时，仍然是无序的
    //2. 老师希望添加的元素，按照字符串大小来排序
    //3. 使用TreeSet 提供的一个构造器，可以传入一个比较器(匿名内部类)
    //   并指定排序规则
    //4. 简单看看源码
    //老韩解读
    public static void main(String[] args) {
        //比较规则是字母表排序
        //单纯比长度的话会导致重复，使得abc消失
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String) o2);
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");//3
        treeSet.add("sp");
        treeSet.add("a");
        treeSet.add("abc");//3
        System.out.println(treeSet);
    }

}
