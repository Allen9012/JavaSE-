package com.encapsulation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-02
 * Time: 13:39
 */
public class Account {
    //为了放封装，三个属性设置为private
    private String name;
    private double balance;
    private String pwd;
//提供构造器
    public Account(){

    }
//有参构造器
    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }
//姓名长度是2，3，4
    public void setName(String name) {
        if(name.length()>=2&&name.length()<=4) {
            this.name = name;
        }else{
            System.out.println("姓名不符合要求");
            this.name="无名";
        }

    }

    public double getBalance() {
        return balance;
    }
//余额要>20
    public void setBalance(double balance) {
        if(balance>20){
            this.balance = balance;
        }else{
            System.out.println("余额必须>20默认为0");
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if(pwd.length()==6){
            this.pwd = pwd;
        }else{
            System.out.println("密码必须要6位");
            this.pwd="000000";
        }
    }
    public void showInfo(){
        System.out.println("账号信息 name="+name+" 余额="+balance+" 密码="+pwd);
        //先判断有没有权限
//        if(){
//        System.out.println("账号信息 name="+name+"余额="+balance+"密码");
//        }else{
//            System.out.println("你无权查看");
//        }
    }

}
