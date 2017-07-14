package com.victor.factory;

/**
 * Created by zhangcs on 2017/7/14.
 */
public class MailSenderFactor implements Provider {
    public Sender produce() {
        return new MailSender();
    }
}
