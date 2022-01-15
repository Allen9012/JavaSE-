package com.CommonClass.Homework;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-21
 * Time: 19:49
 */


/**
 * (1) 将字符串中指定部分进行反转。比如将"abcdef"反转为"aedcbf"
 * (2) 编写方法 public static String reverse(String  str, int start , int end) 搞定
 * 思路分析
 * (1) 先把方法定义确定
 * (2) 把 String 转成 char[] ，因为char[] 的元素是可以交换的
 * (3) 画出分析示意图
 * (4) 代码实现
 */
public class Homework01 {
    public static void main(String[] args) {
        //对输入的参数做一个验证
        //老韩重要的编程技巧分享!!!
        //(1) 写出正确的情况
        //(2) 然后取反即可
        //(3) 这样写，你的思路就不乱
        String str="abcdef";
        System.out.println(str);
//        try {
            str=reverse(str,1,1);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            return;
//        }
        System.out.println("After reverse");
        System.out.println(str);


    }
    public static String reverse(String str, int start,int end){
        if(str!=null&&start>=0&&end>=start&&end<str.length()){
           throw new RuntimeException("parameter is not right");
        }
        char [] chars=str.toCharArray();
        char temp=' ';
        for (int i = start,j=end; i < j; i++,j--) {
            //one come from left index and other one come from right index
            temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
        }
        //use chars to reconstruct a string
        return new String(chars);
    }

}
