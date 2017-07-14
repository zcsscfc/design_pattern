package com.victor.adapter;

/**
 * Created by zhangcs on 2017/7/14.
 */
public class Adapter extends Source implements Targetable {
    public void method2() {
        System.out.println("this is the target method");
    }

    public static void main(String []args){
        Targetable targetable=new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
