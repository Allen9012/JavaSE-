package com.Collection.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-21
 * Time: 21:30
 */
public class Collection_ {
    //老韩解读
//1. 集合主要是两组(单列集合, 双列集合)
//2. Collection 接口有两个重要的子接口List Set , 他们的实现子类都是单列集合
//3. Map 接口的实现子类是双列集合，存放的K-V
//4. 把老师梳理的两张图记住
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Jack");
        arrayList.add("Tom");

        HashMap hashMap = new HashMap();
        hashMap.put("No1","Beijing");
        hashMap.put("No2","Shanghai");
    }
}
