package com.Collection.Properties;

import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-12
 * Time: 19:37
 */
public class Properties_ {
    public static void main(String[] args) {
        //继承HashTable
        Properties properties = new Properties();
        properties.put("john",100);
        properties.put("Lucy",100);
        properties.put("Billy",100);
        properties.put("Wendy",100);
//        properties.put(null,"abc");
//        properties.put("abc",null);
        System.out.println("properties"+properties);
        System.out.println(properties.get("john"));
        properties.remove("Billy");
        System.out.println("properties"+properties);
        properties.put("john",150);
        System.out.println("properties"+properties);

    }
}
