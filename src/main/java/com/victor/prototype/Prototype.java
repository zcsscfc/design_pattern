package com.victor.prototype;

import java.io.*;

/**
 * Created by zhangcs on 2017/7/14.
 */
public class Prototype implements Cloneable,Serializable {

    public static final long serialVerison=1l;
    private String string;

    private SerializableObject serializableObject;

    public Prototype clone() throws CloneNotSupportedException {
        Prototype prototype=(Prototype)super.clone();
        return prototype;
    }

    public Prototype deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream=new ObjectInputStream(byteArrayInputStream);
        return (Prototype) objectInputStream.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getSerializableObject() {
        return serializableObject;
    }

    public void setSerializableObject(SerializableObject serializableObject) {
        this.serializableObject = serializableObject;
    }
}
