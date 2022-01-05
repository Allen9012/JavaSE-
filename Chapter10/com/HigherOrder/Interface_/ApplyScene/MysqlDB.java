package com.HigherOrder.Interface_.ApplyScene;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-16
 * Time: 13:55
 */
public class MysqlDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("连接mysql");
    }
    @Override
    public void close() {
        System.out.println("关闭mysql");
    }
}
