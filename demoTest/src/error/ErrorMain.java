package error;

public class ErrorMain {
    public static void main(String[] args) {
        Err err = new Err();
        try {// 在调用处捕异常
            err.test();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Err{
    int i;
    public void test() throws Exception{// 使用throws抛出异常
       Err b = null;
       System.out.println(b.i);
    }
}
