package com.Enum_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-03
 * Time: 22:07
 */
public class Enumeration01 {
    public static void main(String[] args) {
        Season1 season = new Season1("Spring", "warm");
        Season1 season1 = new Season1("Winter", "cold");
        Season1 season2 = new Season1("Fall", "cool");
        Season1 season3 = new Season1("Summer", "hot");

        //失败,because it disobeys the design of season, the stationary four kind
        //noe we call the enumeration
        Season1 season4 = new Season1("Snowy", "not a season");

    }
}
class Season1{
    private String name;
    private String desc;

    public Season1(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}