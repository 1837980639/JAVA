package single;
/*
* 单例设计模式
* */
public class Single{
    // 构造函数私有化，不允许new
    private Single(){};
   // 用静态变量存储构造方法
    private static  Single single = new Single();
   // 提供get单例对象的方法
    public static Single getSingle() {
        return single;
    }
}
