package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * @author 18379
 */
public class PeoxyDemo implements InvocationHandler {
    Object obj;
     public PeoxyDemo(Object obj){
         this.obj = obj;
     }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + "方法开始执行");
         Object res = method.invoke(this.obj,args);
        System.out.println(method.getName() + "方法结束执行");
         return res;
    }
}
