package com.inheritence.improve_;

import com.inheritence.Graduate;
import com.inheritence.Pupils;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-02
 * Time: 14:30
 */
public class Extends01 {
    public static void main(String[] args) {
        com.inheritence.improve_.Pupil pupils = new Pupil();
        pupils.name="小明";
        pupils.age=10;
        pupils.testing();//测试
        pupils.setScore(60);
        pupils.showInfo();
        Graduate graduate = new Graduate();
        graduate.name="大明~";
        graduate.age=18;
        graduate.testing();
        graduate.setScore(80);
        graduate.showInfo();
    }
}
