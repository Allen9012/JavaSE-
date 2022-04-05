package com.Allen.common;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-03-29
 * Time: 22:25
 */
public interface MessageType {
    //1. 在接口中定义了一些常量
    //2. 不同的常量的值，表示不同的消息类型.
    String MESSAGE_LOGIN_SUCCEED="1";//login
    String MESSAGE_LOGIN_FAIL="2";//login fail
    String MESSAGE_COMM_MES="3";//common message pack
    String MESSAGE_GET_ONLINE_FRIEND="4";//return online client list
    String MESSAGE_RET_ONLINE_FRIEND="5";//get online client list
    String MESSAGE_CLIENT_EXIT="6";//client exit

}
