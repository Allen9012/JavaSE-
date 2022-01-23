package com.Collection.Homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-15
 * Time: 10:55
 */
public class Homework03 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("smith",2000);

        System.out.println(hashMap);
         hashMap.put("jack", 2600);


         //add 100 to all the clerk
        Set set = hashMap.keySet();
        for (Object key: set) {
        hashMap.put(key,(int)hashMap.get(key)+100);
        }
        System.out.println(hashMap);


        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry= (Map.Entry) iterator.next();
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }
}
/**
 * 按要求完成下列任务
 * 1）使用HashMap类实例化一个Map类型的对象m，键（String）和值（int）分别用于存储员工的姓名和工资，
 * 存入数据如下：	jack—650元；tom—1200元；smith——2900元；
 * 2）将jack的工资更改为2600元
 * 3）为所有员工工资加薪100元；
 * 4）遍历集合中所有的员工
 * 5）遍历集合中所有的工资
 */