package com.victor.factory;

/**
 * Created by zhangcs on 2017/7/14.
 */
public class MailSender implements Sender {
    public void send() {
        System.out.println("this is MailSender");
    }
}
