package com.Enum_;

import sun.applet.Main;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-04
 * Time: 13:07
 */
public class EnumMethod {
    public static void main(String[] args) {
         // use season2 enum class,to show all kinds of method
        Season3 autumn = Season3.AUTUMN;
        //output name of the object
        System.out.println(autumn.name());
        //ordinal shows the sequence of the enum object,
        // and the first order num is 0
        System.out.println(autumn.ordinal());
Season3[] values =Season3.values();
        for (Season3 season:values) {// :后面是数组的名字，前面是每一个循环里面的值
            System.out.println(season);
        }



        /*补充了一个增强for
// int[] nums = {1, 2, 9};
// //普通的for 循环
// System.out.println("=====普通的for=====");
// for (int i = 0; i < nums.length; i++) {
// System.out.println(nums[i]);
// }
// System.out.println("=====增强的for=====");
// //执行流程是依次从nums 数组中取出数据，赋给i, 如果取出完毕，则退出for
// for(int i : nums) {
// System.out.println("i=" + i);
// }
         */




        //valueOf：将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常
//执行流程
//1. 根据你输入的"AUTUMN" 到Season3 的枚举对象去查找
//2. 如果找到了，就返回，如果没有找到，就报错
        Season3 autumn1 = Season3.valueOf("AUTUMN");
        System.out.println("autumn1=" + autumn1);
        System.out.println(autumn == autumn1);
//compareTo：比较两个枚举常量，比较的就是编号
//老韩解读
//1. 就是把Season2.AUTUMN 枚举对象的编号和Season3.SUMMER 枚举对象的编号比较
//2. 看看结果



        /*  just judge the serial number
public final int compareTo(E o) {
return self.ordinal - other.ordinal;
}
Season3.AUTUMN 的编号[2] - Season3.SUMMER 的编号[3]
*/
        System.out.println(Season3.AUTUMN.compareTo(Season3.SUMMER));
//补充了一个增强for
// int[] nums = {1, 2, 9};
// //普通的for 循环
// System.out.println("=====普通的for=====");
// for (int i = 0; i < nums.length; i++) {
// System.out.println(nums[i]);
// }
// System.out.println("=====增强的for=====");
// //执行流程是依次从nums 数组中取出数据，赋给i, 如果取出完毕，则退出for
// for(int i : nums) {
// System.out.println("i=" + i);
// }
    }
}


