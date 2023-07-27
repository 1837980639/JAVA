package codeBlock;

public class CodeBlock {
    public static int i;
    public String str;
    public void test(){
        System.out.println("执行非静态方法");
    }
    public static void  st(){
        System.out.println("执行静态方法");
    }
    /*
     *静态代码块（大多用于无法通过构造器初始化的情况，如匿名内部类）
     *代码中含有的得是静态变量及方法
    */
    static {
        st();
        i=0;
    }
    // 非静态代码块
    {
        test();
        str = "123";
    }
}
