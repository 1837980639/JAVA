package thread.pac;

public class pro_con {
    public static void main(String[] args) {
        Check check = new Check();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (check){
                    while (true){
                        if(check.productNum == 0){
                            System.out.println("开始生产");
                            while (check.productNum < 4){
                                check.productNum ++;
                                System.out.println("库存：" + check.productNum);
                            }
                            System.out.println("生产结束");
                            check.notify();// 唤醒消费者线程
                        }else{
                            try {
                                check.wait();// 生产者线程休息
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
        },"生产者").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (check){
                    while (true){
                        if(check.productNum == 4){
                            System.out.println("开始消费");
                            while (check.productNum > 0){
                                check.productNum --;
                                System.out.println("库存：" + check.productNum);
                            }
                            System.out.println("消费结束");
                            check.notify();// 唤醒生产者线程
                        }else{
                            try {
                                check.wait();// 消费者线程休息
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
        },"消费者").start();
    }
}
class Check{
    static int  productNum = 0;
}
