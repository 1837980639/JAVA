package codeBlock;
/*
* 匿名内部类
* */
public class InnerClass {
    public static CodeBlock codeBlockInner = new CodeBlock(){
        @Override
        public void test() {
            System.out.println("匿名内部类里面的test");
        }
    };
}
