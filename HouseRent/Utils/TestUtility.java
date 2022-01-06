package HouseRent.Utils;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-05
 * Time: 23:24
 */
public class TestUtility {
    public static void main(String[] args) {
        //要求输入字符串，长度最大为3
        Utility.readString(3);

        //要求输入一个字符串，且长度最大为10，大阪市如果用户直接回车，就给一个默认值

        Utility.readString(10,"hello");

    }
}
