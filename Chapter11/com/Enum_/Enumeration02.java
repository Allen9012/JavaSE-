package com.Enum_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-03
 * Time: 22:14
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.SPRING);
    }
}
class Season2{

    //1. 将构造器私有化,目的防止直接new
//2. 去掉setXxx 方法, 防止属性被修改
    //3. 在Season 内部，直接创建固定的对象
//4. 优化，可以加入final 修饰符
    private String name;
    private String desc;
    //定义了四个对象, 固定.
    public static final Season2 SPRING = new Season2("春天", "温暖");
    public static final Season2 WINTER = new Season2("冬天", "寒冷");
    public static final Season2 AUTUMN = new Season2("秋天", "凉爽");
    public static final Season2 SUMMER = new Season2("夏天", "炎热");
    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }


    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}