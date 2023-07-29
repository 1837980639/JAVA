package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyMain {
    public static void main(String[] args) {
        ItestDemo test = new TestDemImpl();
        System.out.println("正常输出-----------");
        test.test1();
        test.test2();

        System.out.println("代理输出（可以做统一输出的）-----------");
        InvocationHandler handler = new PeoxyDemo(test);

        ItestDemo t = (ItestDemo) Proxy.newProxyInstance(handler.getClass().getClassLoader(), test.getClass().getInterfaces(),handler);
        t.test1();
        t.test2();
    }
}
