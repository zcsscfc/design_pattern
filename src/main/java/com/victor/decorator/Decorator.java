package com.victor.decorator;

/**
 * Created by zhangcs on 2017/7/14.
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
    }

    public void method() {
        System.out.println("befor decorator");
        source.method();
        System.out.println("end decorator");
    }

    public static void main(String[]args){
        Sourceable source=new Source();
        Sourceable obj=new Decorator(source);
        obj.method();
    }
}
