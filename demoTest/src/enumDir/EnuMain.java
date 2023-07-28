package enumDir;

public class EnuMain {
    public static void main(String[] args) {
        Seaon spring = Seaon.SPRING;// 直接调用里面的方法来创建对象
        spring.showInfo();
        Seaon summer = Seaon.SUMMER;
        summer.showInfo();
    }
}

enum Seaon{
    SPRING("春天","春暖花开"),// 相当于调用了Seaon的构造方法创建了一个对象
    SUMMER("夏天","炎炎夏日"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","寒风凛冽");
    private final String name;
    private final String desc;

    private Seaon(String name,String desc) {
        this.name = name;
        this.desc = desc;
    }
    public void showInfo(){
        System.out.println(this.name+":"+this.desc);
    }
}
