package com.ObjectMiddle.HomeworkChapter7;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-11-28
 * Time: 11:40
 */
public class Homework01 {
    public static void main(String[] args) {
        A01 a01=new A01();
        double[] arr= {1.3,3.3,3.5};
        Double ret=a01.max(arr);
        if(ret!=null){
            System.out.println("arr的最大值"+ ret);
        }else{
            System.out.println("arr的输入有误,数组不能为null或者{}");
        }
    }
}
class A01{
    public Double max(double[]arr){
        //判空arr至少有一个元素
        if(arr.length>0 && arr!= null){
            double max=arr[0];
            for(int i = 1; i <arr.length ; i++) {
                if(max<arr[i]){
                    max=arr[i];
                }
            }
            return max;
        }else{//改成用对象接受，就可以判空
            return null;
        }
    }



}