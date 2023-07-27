package factory;

/*
 * 工厂前置接口
 * */
public interface BWM {
    void showInfo();
}

class BWM3 implements BWM {
    public void showInfo() {
        System.out.println("生产宝马3系");
    }
}

class BWM5 implements BWM {
    public void showInfo() {
        System.out.println("生产宝马5系");
    }
}

class BWM7 implements BWM {
    public void showInfo() {
        System.out.println("生产宝马7系");
    }
}

