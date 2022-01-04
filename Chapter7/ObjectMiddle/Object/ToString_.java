package com.ObjectMiddle.Object;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-11
 * Time: 17:11
 */
public class ToString_ {
    public static void main(String[] args) {
        //Object the source code of toString
//        public String toString() {
//            return getClass().getName() + "@" + Integer.toHexString(hashCode());
//        }
        Monster monster = new Monster("小妖怪", "巡山的", 1000);
        System.out.println(monster.toString() + " hashcode=" + monster.hashCode());
        System.out.println("==当直接输出一个对象时，toString 方法会被默认的调用==");
        System.out.println(monster); //等价monster.toString()
    }
}
class Monster {
    private String name;
    private String job;
    private double sal;
    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }
    //重写toString 方法, 输出对象的属性
//使用快捷键即可alt+insert -> toString
    @Override
    public String toString() { //重写后，一般是把对象的属性值输出，当然程序员也可以自己定制
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}