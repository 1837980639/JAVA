package single;
/*
* 懒汉型单例：在第一次调用时完成new
* */
public class SingleLan {
    private SingleLan(){};
    private static SingleLan singleLan = null;

    public static SingleLan getSingleLan() {
        if(singleLan == null){
            singleLan =  new SingleLan();
        }
        return singleLan;
    }
}
