package io;

import java.io.Serializable;
/*
  可以序列化和反序列化的对象
 */
public class IoPerson implements Serializable {
    public String name;
    public int age;

    private static final long serialVersionUID = 1L;


    public void showInfo() {
        System.out.println("IoPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}');
    }
}
