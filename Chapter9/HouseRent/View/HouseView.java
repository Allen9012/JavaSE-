package HouseRent.View;

import HouseRent.Domain.House;
import HouseRent.Service.HouseService;
import HouseRent.Utils.Utility;

import java.security.PrivateKey;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-05
 * Time: 22:52
 */
public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(10);

    public void listHouses() {
        System.out.println("===========List of houses ===========");
        System.out.println("id\t\tname\t\tphone\t\taddress\t\trent\t\tstate(vacant/leased)");
        House[] houses = houseService.list();
        for (House house : houses) {
            if (house == null) {//防止输出null
                break;
            }
            System.out.println(house);
        }
        System.out.println("===========Displaying done===========");

    }

    //编写addHouse() 接收输入，创建House对象，调用add方法
    public void addHouse() {
        //id 有系统自动分配
        System.out.println("===========Adding new estates===========");
        System.out.print("name: ");
        String name = Utility.readString(8);
        System.out.print("phone: ");
        String phone = Utility.readString(12);
        System.out.print("address: ");
        String address = Utility.readString(16);
        System.out.print("rent: ");
        int rent = Utility.readInt();
        System.out.print("state: ");
        String state = Utility.readString(3);
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("=============add new estate success============");
        } else {
            System.out.println("=============add new estate fail============");
        }
    }
    //根据id查找房屋信息

    public void findHouse() {
        System.out.println("=============Finding estate Information============");
        System.out.print("Please enter the ID you are looking for:");
        int findId = Utility.readInt();
        //调用方法
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("============Not Found=============");
        }
    }

    public void delHouse() {
        System.out.println("=============Delete estate Information============");
        System.out.print("Please enter the number of the house to be deleted (-1 exit): ");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("give up delete");
            return;
        }
        //Otherwise use Utility method
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("delete success");
            } else {
                System.out.println("can't find the estate with Id you provided");
            }
        } else {
            System.out.println("give up delete");
        }
    }

    public void update() {
        System.out.println("=============Modify estate Information============");
        System.out.println("Please select the estate Id to be modified (-1 indicates exit): ");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("=============give up modifying============");
            return;
        }
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("The modified house id does not exist");
        }
        System.out.print("name(" + house.getName() + "): ");
        String name = Utility.readString(8, "");//这里如果用户直接回车表示不修改该信息,默认""
        if (!"".equals(name)) {//修改
            house.setName(name);
        }

        System.out.print("phone(" + house.getPhone() + "):");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }
        System.out.print("address(" + house.getAddress() + "): ");
        String address = Utility.readString(18, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }
        System.out.print("rent(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }
        System.out.print("state(" + house.getState() + "):");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }
        System.out.println("=============modify successfully============");
    }

    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    public void mainMenu() {
        do {
            System.out.println("===========HouseRentSysMenu===========");
            System.out.println("\t\t1 add new estate");
            System.out.println("\t\t2 search an estate");
            System.out.println("\t\t3 delete estate information");
            System.out.println("\t\t4 modify estate information");
            System.out.println("\t\t5 display estate information");
            System.out.println("\t\t6 exit Sys");
            System.out.print("please enter you choice(1-6): ");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }


}

