package com.victor.adapter;

/**
 * Created by zhangcs on 2017/7/14.
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    public void method1() {
        source.method1();
    }

    public void method2() {
        System.out.println("this is target method");
    }
}
