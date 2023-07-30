package thread;

public class TreadSync {
    public static void main(String[] args) {
        //定义账户对象
        Acount a = new Acount();

        // 多线程对象（无同步锁）
        User u_weixin = new User(a, 2000);
        User u_zhifubao = new User(a, 2000);

        Thread weixin = new Thread(u_weixin,"微信");
        Thread zhifubao = new Thread(u_zhifubao, "支付宝");

        weixin.start();
        zhifubao.start();
        System.out.println("--------------无同步锁：---------------");
        try {
            weixin.join();
            zhifubao.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-------------无同步锁：----------------");

        /**
         * 多线程对象（有同步锁）
         */

        AcountSync as = new AcountSync();
        
        User u_weixinSync = new User(as, 2000);
        User u_zhifubaoSync  = new User(as, 2000);

        Thread weixinSync  = new Thread(u_weixinSync,"微信");
        Thread zhifubaoSync  = new Thread(u_zhifubaoSync, "支付宝");

        weixinSync.start();
        zhifubaoSync.start();

        System.out.println("--------------有同步锁，锁方法，测试是否同一对象锁：---------------");
        try {
            weixinSync.join();
            zhifubaoSync.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-------------有同步锁，锁方法，测试是否同一对象锁：----------------");



    }
}

// 账户对象（类银行）


/**
 * 俩个线程同时执行发生冲突
 */
class Acount {
    public static  int money = 3000;
    public  void drawing(int m){
        String name = Thread.currentThread().getName();
        if(money < m){
            System.out.println(name + "操作，金额不足" + money);
        }else {
            System.out.println(name+"账户原有金额:" + money);
            System.out.println(name+"取款金额:" + m);
            money -=m;
            System.out.println(name+"取款后余额：" + money);
        }

    }
}

/**
 * synchronized
 * 同步锁锁普通方法的时候是锁整个对象，同一个对象使用时连着下面没有同步锁的一起锁了
 */
class AcountSync{
    public static  int money = 3000;
    public synchronized void drawing(int m){
        String name = Thread.currentThread().getName();
        if(money < m){
            System.out.println(name + "操作，金额不足" + money);
        }else {
            System.out.println(name+"账户原有金额:" + money);
            System.out.println(name+"取款金额:" + m);
            money -=m;
            System.out.println(name+"取款后余额：" + money);
        }

    }
    public void drawing1(int m){
        String name = Thread.currentThread().getName();
        if(money < m){
            System.out.println(name + "操作，金额不足" + money);
        }else {
            System.out.println(name+"账户原有金额:" + money);
            System.out.println(name+"取款金额:" + m);
            money -=m;
            System.out.println(name+"取款后余额：" + money);
        }

    }
}

/**
 *  synchronized 加入static时，使用这个类所有对象都有加了同步锁
 */
class AcountSyncStatic{
    public static  int money = 3000;
    public static synchronized void drawing(int m){
        String name = Thread.currentThread().getName();
        if(money < m){
            System.out.println(name + "操作，金额不足" + money);
        }else {
            System.out.println(name+"账户原有金额:" + money);
            System.out.println(name+"取款金额:" + m);
            money -=m;
            System.out.println(name+"取款后余额：" + money);
        }

    }
    public void drawing1(int m){
        String name = Thread.currentThread().getName();
        if(money < m){
            System.out.println(name + "操作，金额不足" + money);
        }else {
            System.out.println(name+"账户原有金额:" + money);
            System.out.println(name+"取款金额:" + m);
            money -=m;
            System.out.println(name+"取款后余额：" + money);
        }

    }
}

/**
 *  synchronized使用代码快的方式
 *  synchronized (this)
 *  使用代码块的的方法用的是同一对象的同步锁
 *  使用不同对象的同步锁 将this的换成对象 见drawing4
 */
class AcountSyncCode{
    public static  int money = 3000;
    public  void drawing(int m){
        synchronized (this){
            String name = Thread.currentThread().getName();
            if(money < m){
                System.out.println(name + "操作，金额不足" + money);
            }else {
                System.out.println(name+"账户原有金额:" + money);
                System.out.println(name+"取款金额:" + m);
                money -=m;
                System.out.println(name+"取款后余额：" + money);
            }
        }

    }
    public void drawing1(int m){
        synchronized (this){
            String name = Thread.currentThread().getName();
            if(money < m){
                System.out.println(name + "操作，金额不足" + money);
            }else {
                System.out.println(name+"账户原有金额:" + money);
                System.out.println(name+"取款金额:" + m);
                money -=m;
                System.out.println(name+"取款后余额：" + money);
            }
        }

    }
    public void drawing2(int m){
            String name = Thread.currentThread().getName();
            if(money < m){
                System.out.println(name + "操作，金额不足" + money);
            }else {
                System.out.println(name+"账户原有金额:" + money);
                System.out.println(name+"取款金额:" + m);
                money -=m;
                System.out.println(name+"取款后余额：" + money);
            }
        }
    public void drawing4(int m,Acount acount){
        synchronized (acount){
            String name = Thread.currentThread().getName();
            if(money < m){
                System.out.println(name + "操作，金额不足" + money);
            }else {
                System.out.println(name+"账户原有金额:" + money);
                System.out.println(name+"取款金额:" + m);
                money -=m;
                System.out.println(name+"取款后余额：" + money);
            }
        }

    }
}

/**
 * 线程优先级、线程的通信
 */
class Acountss{
    public static  int money = 3000;
    public  void drawing(int m,Acount acount) throws InterruptedException {
        synchronized (this){
            String name = Thread.currentThread().getName();
            if(name == "微信"){
                acount.wait(); //先阻塞，让优先级更高的先操作
            }
            if(money < m){
                System.out.println(name + "操作，金额不足" + money);
            }else {
                System.out.println(name+"账户原有金额:" + money);
                System.out.println(name+"取款金额:" + m);
                money -=m;
                System.out.println(name+"取款后余额：" + money);
            }

            if(name == "支付宝"){
                acount.notify(); //唤醒，执行优先级高的线程（因为阻塞了，所以优先级最高的是支付宝）
//                acount.notifyAll(); //唤醒所有线程（因为阻塞了，所以优先级最高的是支付宝）
            }
        }

    }
}
class User implements Runnable{
    Acount acount;
    AcountSync acountSync;
    String flag;// 确定执行的函数
    int money;
    public User(){}
    public User(Acount acount,int money){
        this.acount = acount;
        this.money = money;
        this.flag = "无同步锁";
    }
    public User(AcountSync acountSync,int money){
        this.acountSync = acountSync;
        this.money = money;
        this.flag = "有同步锁（看是否锁在同一个对象）";
    }
    @Override
    public void run() {
        switch (this.flag){
            case "无同步锁":
                acount.drawing(money);break;
            case "有同步锁（看是否锁在同一个对象）" :
                acountSync.drawing(money);
                acountSync.drawing1(money);
                break;
            default:
                System.out.println("结束");
        }



    }
}
