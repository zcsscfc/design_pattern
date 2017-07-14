package com.victor.prototype;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        prototype.setString("victor");
        try {
            Prototype newobj = prototype.deepClone();

            System.out.println(newobj.getString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
