package HouseRent.Service;

import HouseRent.Domain.House;

import java.security.spec.DSAPrivateKeySpec;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-06
 * Time: 12:43
 */
public class HouseService {
    private House[] houses;//房屋对象数组
    private int idCounter = 1;//记录id的自增长器
    private int houseNums = 1;//记录有多少个房屋信息

    public HouseService(int size) {
        houses = new House[size];//创建对象的时候指定数组的大小
        //测试一个大牛马对象
        houses[0] = new House(1, "大牛马", "8848", "海淀区", 2500, "已出租");
    }

    public boolean add(House newHouse) {
        //判断是否可以继续添加
        if (houseNums == houses.length) {
            System.out.println("数组已满不能添加");
            return false;
        }
        //newHouse对象加入到数组之后
        houses[houseNums++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }

    public boolean del(int delId) {
        //first find the estate that is designated
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }//遍历一遍看看找到的话把index换成i
        }
        if (index == -1) {//没找到
            return false;
        }
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }//删除操作，从index开始，后面的覆盖前面的

        houses[--houseNums] = null;//当前存在的房屋信息的最后一个置空，并houseNums减少

        return true;
    }

    public House findById(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }

    public House[] list() {
        return houses;
    }
}
