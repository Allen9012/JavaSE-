package com.Generic.Homework;

import org.junit.jupiter.api.Test;

import java.security.Key;
import java.security.PublicKey;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-29
 * Time: 20:05
 */
public class Homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        //说明，这里给泛型T指定类型是User
        Dao<Object> objectDao = new Dao<>();
        objectDao.save("001",new User(1,10,"jack"));
        objectDao.save("002",new User(2,10,"king"));
        objectDao.save("003",new User(3,10,"smith"));
        List<Object> list = objectDao.list();
        System.out.println("list="+list);
    }
}

class Dao<T> {
    private Map<String,T> map=new HashMap<>();

    public T get(String id) {
        return map.get(id) ;
    }
    public void save(String id, T entity) {
        map.put(id,entity);
    }
    public void update(String id, T entity){
map.put(id,entity);
    }
    //遍历map，将map的所有value（entity），封装到ArrayList
    public List<T> list(){
        List<T> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String key: keySet) {
            list.add(map.get(key));//也可以直接使用本类的 public T get(String id)
        }
        return list;
    }
    public  void delete(String id){
        map.remove(get(id));
    }
}

class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}