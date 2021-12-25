package com.HigherOrder.Interface_.ApplyScene;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-16
 * Time: 13:56
 */
public class Interface03 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
        OracleDB oracleDB = new OracleDB();
        t(oracleDB);
    }
    public static void t(DBInterface dbInterface){
        dbInterface.connect();
        dbInterface.close();
    }
}
