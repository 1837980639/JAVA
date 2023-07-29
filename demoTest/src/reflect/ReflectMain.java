package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectMain {
    public static void main(String[] args) {
        /*
            获取类
         */
        Person p = new Person();
        Class clazz = p.getClass();// 通过对象创建class实例

        Class c0 = Person.class;// 通过类目.class创建class实例

        // 通过class的静态方法forName来获取
        //forName（全路径【包名、类名】）
        try {
            Class C1 = Class.forName("reflect.Person");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        /*
            获取父类和接口
         */

        Class superClazz = clazz.getSuperclass();// 获取父类
        System.out.println("父类："+superClazz);

        Class[] interfaces = clazz.getInterfaces();// 获取当前类的所有接口
        for(Class c : interfaces){
            System.out.println("接口："+c.getName());
        }

        /*
            获取类的构造方法
            getName() 获取构造方法名称
            getModifiers() 获取修饰符 1：public 2：private
            getParameterTypes() 获取构造方法参数类型
         */

        Constructor[] constructor = clazz.getConstructors();// 获取公有的构造方法
        for (Constructor c : constructor){
            System.out.println("========================");
            System.out.println("构造方法名称："+ c.getName() + "修饰符是:" + c.getModifiers() );

            Class[] paramClazz = c.getParameterTypes();// 获取构造方法参数类型
            for (Class pc : paramClazz){
                System.out.println("参数类型：" + pc.getName());
            }
            System.out.println("========================");
        }

        Constructor[] constructor2 = clazz.getDeclaredConstructors();// 获取所有的构造方法
        for (Constructor c : constructor2){
            System.out.println("========================");

            System.out.println("构造方法名称："+ c.getName() + "\t修饰符是:" + c.getModifiers() );

            Class[] paramClazz = c.getParameterTypes();// 获取构造方法参数类型
            for (Class pc : paramClazz){
                System.out.println("参数类型：" + pc.getName());
            }

            System.out.println("========================");
        }

        /*
            用反射创建对象
            newInstance() 创建对象
            setAccessible(接触私有封装,方法属性构造方法都可以)
         */
        try {
            Class StudentClazz = Student.class;
            Object obj = StudentClazz.newInstance();// 相当于调用公有的无参构造方法
            Student student = (Student) obj;

            Constructor constructor1 = StudentClazz.getConstructor(String.class);// 指定获取有一个参数并且类型有String的公有构造函数
            Student student1 = (Student) constructor1.newInstance("第一中学");
            System.out.println(student1.school);

            Constructor constructor3 =StudentClazz.getDeclaredConstructor(String.class,int.class);// 指定获取俩个参数并且类型有String,int的构造函数
            constructor3.setAccessible(true);// 解除私有封装，强制调用私有构造方法
            Student student2 = (Student) constructor3.newInstance("张三",12);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        /*
            获取方法
         */
        Method[] methods = clazz.getMethods();// 获取公有的方法
        for (Method ms : methods){
            System.out.println("---------------------------------");
            System.out.println("方法名：" + ms.getName());
            System.out.println("返回值类型：" + ms.getReturnType());
            System.out.println("修饰符：" + ms.getModifiers());
            Class[] pcs = ms.getParameterTypes();// 获取方法的参数类型
            if(pcs != null && pcs.length>0){
                for(Class pc : pcs){
                    System.out.println("参数类型"+pc.getName());
                }
            }
            System.out.println("---------------------------------");
        }

        Method[] methods2 = clazz.getDeclaredMethods();// 获取所有的方法
        for (Method ms2 : methods2){
            System.out.println("---------------------------------");
            System.out.println("方法名：" + ms2.getName());
            System.out.println("返回值类型：" + ms2.getReturnType());
            System.out.println("修饰符：" + ms2.getModifiers());
            Class[] pcs = ms2.getParameterTypes();// 获取方法的参数类型
            if(pcs != null && pcs.length>0){
                for(Class pc : pcs){
                    System.out.println("参数类型"+pc.getName());
                }
            }
            System.out.println("---------------------------------");
        }

        // 调用方法
        try {
            Method method = clazz.getMethod("showInfo",String.class);
            Object obj = clazz.getConstructor().newInstance();
            method.invoke(obj,"谢谢你");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        /**
         * getField() 获取指定公有属性
         * getFields()获取公有属性
         * getDeclaredField()获取指定属性
         * getDeclaredFields()获取所有属性
         * getPackage() 获取包
         * get
         */
    }
}
