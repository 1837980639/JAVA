package io;

import java.io.*;

public class IoObject {
    public static void main(String[] args) {
        try {
            testSeriaize();
            testDeseriaize();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // 序列化
    public static void testSeriaize() throws Exception{
        // 序列化并将序列化的数据存在指定文件
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\AHomeWrok\\JAVA\\demoTest\\src\\io\\obj.txt"));

        IoPerson P = new IoPerson();
        P.name = "张三";
        P.age = 12;

        objectOutputStream.writeObject(P);
        objectOutputStream.flush();// 刷入硬盘

        objectOutputStream.close();
    }

    // 反序列化
    public static void testDeseriaize() throws Exception{
        // 序列化并将序列化的数据存在指定文件
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\AHomeWrok\\JAVA\\demoTest\\src\\io\\obj.txt"));

        Object obj = objectInputStream.readObject();

        IoPerson p = (IoPerson)obj;
        p.showInfo();

        objectInputStream.close();
    }
}
