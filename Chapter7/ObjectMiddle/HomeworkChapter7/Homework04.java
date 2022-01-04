package com.ObjectMiddle.HomeworkChapter7;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-11-28
 * Time: 14:41
 */
public class Homework04 {
    public static void main(String[] args) {
        int []oldArr={1,2,3,4,5,5,6};
        A03 a03 = new A03();
        int []newArr=a03.copyArr(oldArr);

        System.out.println(  Arrays.toString(newArr));
    }
}
class A03{
    public int[]copyArr(int[] oldArr){
        int []newArr=new int[oldArr.length];
        for(int i=0;i<oldArr.length;i++){
            newArr[i]=oldArr[i];
        }
        return newArr;
    }
}