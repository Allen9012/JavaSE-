package HouseRent;

import HouseRent.View.HouseView;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-05
 * Time: 23:13
 */
public class HouseRentApp {
    public static void main(String[] args) {
        //create HouseView and show the main menu
        new HouseView().mainMenu();
        System.out.println("you have exit the HouseRentSys");
    }
}
