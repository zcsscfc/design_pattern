package com.victor.factory;

/**
 * Created by zhangcs on 2017/7/14.
 */
public class SendFactory {
    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else {
            return null;
        }
    }

    public static void main(String []args){
        SendFactory factory=new SendFactory();
        Sender sender= factory.produce("sms");
        sender.send();
    }
}
