package com.HigherOrder.Interface_.InterfaceDetail;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-16
 * Time: 14:07
 */
public class InterfaceDetail02 {
    public static void main(String[] args) {
        System.out.println(IB.n1);//indicate n1 is static
        //IB.n1=30  ;//indicate n1 is final
    }
}
interface IB{
    void hi();
    int n1=10;
    //actually the n1 here is public static final int
}
interface IC{
    void say();
}
//one class can implements multiple implements in one time
class Pig implements IB ,IC{

    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}