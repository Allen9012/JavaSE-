package com.Collection.Map_;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-23
 * Time: 12:41
 */
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");

        //第一组: important 先取出所有的Key , 通过Key 取出对应的Value
        Set keyset = map.keySet();

        //1. for
        for (Object key :keyset) {
            System.out.println(key+"-"+map.get(key));
        }
        //2.iterate
        Iterator iterator=keyset.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();

        }
        //第二组 把所有的values取出
        Collection values = map.values();
        //可以使用所有collection method
        //(1) 增强for
        System.out.println("---取出所有的value 增强for----");
        for (Object value : values) {
            System.out.println(value);
        }
//(2) 迭代器
        System.out.println("---取出所有的value 迭代器----");
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object value = iterator2.next();
            System.out.println(value);
        }
        //第三组：EntrySet
        Set entrySet = map.entrySet();// EntrySet<Map.Entry<K,V>>
        //1.strengthened for
        for (Object entry :entrySet) {
            //把entry转换为Map.Entry
            Map.Entry m=(Map.Entry)entry;
            System.out.println(m.getKey() + "-" + m.getValue());
            //因为方法是 Map.Entry，所以要向下转
        }
        //(2) 迭代器
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object entry =  iterator1.next();
            //System.out.println(next.getClass());//  -实现-> Map.Entry (getKey,getValue)
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }
}
