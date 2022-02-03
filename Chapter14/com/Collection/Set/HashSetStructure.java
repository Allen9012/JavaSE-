package com.Collection.Set;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-23
 * Time: 10:23
 */
public class HashSetStructure {
    public static void main(String[] args) {
        //simulate how to make a hashset
        //1. first create an array
        Node[] table =new Node[16];
        //2.somebody called Node as table

        //3. create node single direction
        Node john= new Node("John",null);
        table[2]=john;

        Node jack = new Node("Jack", null);
        john.next=jack;

        Node rose = new Node("Rose", null);
        jack.next=rose;

        Node lucy = new Node("Lucy", null);
        rose.next=lucy;
        System.out.println("table= "+table);

    }
}
class Node{
    Object item;//store data
    Node next;//point to next Node
    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}