package com.inheritence;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-04
 * Time: 10:36
 */
public class ExtendsTheory {
    public static void main(String[] args) {
        son son = new son();
        System.out.println(son.name);//按照查找规则来返回信息
        System.out.println(son.getAge());//按照查找规则来返回信息
        System.out.println(son.hobby);//按照查找规则来返回信息
    }

}
class Grandpa{//爷类
    String name="大头爷爷";
    String hobby="旅游";
}
class Father extends Grandpa{//父类
    String name="大头爸爸";
    private int age=39;

    public int getAge() {
        return age;
    }
}
class son extends Father{//子类
    String name="大头儿子";
}