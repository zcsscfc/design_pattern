package com.victor.factory;

/**
 * Created by zhangcs on 2017/7/14.
 */
public class App {
    public static void main(String []args){
        Provider provider=new SmsSenderFactor();
        Sender sender=provider.produce();
        sender.send();
    }
}
