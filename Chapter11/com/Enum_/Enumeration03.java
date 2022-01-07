package com.Enum_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-03
 * Time: 22:22
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season3.AUTUMN);
        System.out.println(Season3.SPRING);
    }
}
enum  Season3 {
    SPRING("Spring","warm"),
    WINTER("冬天", "寒冷"),
    AUTUMN("秋天", "凉爽"),
    SUMMER("夏天", "炎热"), What;


    //use keyword emum
    private String name;
    private String desc;
    //定义了四个对象, 固定.
//    public static final Season3 SPRING = new Season3("春天", "温暖");
//    public static final Season3 WINTER = new Season3("冬天", "寒冷");
//    public static final Season3 AUTUMN = new Season3("秋天", "凉爽");
//    public static final Season3 SUMMER = new Season3("夏天", "炎热");

    private Season3(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

   private Season3() {

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