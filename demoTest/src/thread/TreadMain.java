package thread;


public class TreadMain {
    public static void main(String[] args) {
        // 继承方式创建线程
        Thread tread = new TreadExtends();

        Thread treadRun = new Thread(new TreadRunnable(),"t-2");//Runnable实现接口的方式创建线程 第二个参数传递线程名

        // 设置优先级
        tread.setPriority(2);
        treadRun.setPriority(1);

        // 启动线程 开始运行run()代码

        tread.start();
        treadRun.start();

        System.out.println("---------------1");
        try {
            treadRun.join();// 将润代码插入这里执行 保证这个一定在上下之间完整执行
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------2");

        System.out.println(tread.isAlive());// 判断线程是否存活
        tread.stop();// 强制结束线程
        System.out.println(tread.isAlive());
    }
}
