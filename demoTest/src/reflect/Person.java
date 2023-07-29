package reflect;

import java.io.Serializable;

/*
  父类
 */
public class Person implements Serializable {
    public String name;
    public int age;


    public Person(){}
    private Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void showInfo(String str) {
        System.out.println("IoPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}'+str);
    }
}
