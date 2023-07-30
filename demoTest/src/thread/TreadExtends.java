package thread;
/**
 * 使用继承的方式来实现多线程
 */
public class TreadExtends extends Thread{


    @Override
    public void run() {
        for (int i = 0; i < 5;i++){
            if(i%2 == 0){
                Thread.yield();//线程让步

            }

            System.out.println("多线程代码"+i);
        }
    }
}
