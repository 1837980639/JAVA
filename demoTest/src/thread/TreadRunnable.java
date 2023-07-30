package thread;

/**
 * 使用实现Runnable接口的方式来实现多线程
 * Thread.currentThread().getName() 线程名称 靠创建时传递参数
 */
public class TreadRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5;i++){
            try {
                Thread.sleep(Long.parseLong("1000"));// 当前睡眠1s
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName()+"多线程代码"+i);
        }
    }
}
