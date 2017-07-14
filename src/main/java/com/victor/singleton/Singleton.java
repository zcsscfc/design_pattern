package com.victor.singleton;

/**
 * Created by zhangcs on 2017/7/14.
 */
public class Singleton {
    private Singleton() {

    }

    private static class SingletonFactor{
        private static Singleton instance=new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonFactor.instance;
    }
}
