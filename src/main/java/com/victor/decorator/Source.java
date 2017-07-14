package com.victor.decorator;

/**
 * Created by zhangcs on 2017/7/14.
 */
public class Source implements Sourceable {
    public void method() {
        System.out.println("the original method!");
    }
}
