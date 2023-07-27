package factory;

/*
 * 工厂模式
 * */
interface BWMFactory {
    BWM productBwn();
}

class BWM3Factory implements BWMFactory {
    public BWM productBwn() {
        return new BWM3();
    }
}

class BWM5Factory implements BWMFactory {
    public BWM productBwn() {
        System.out.println("改造宝马5系");
        return new BWM5();
    }
}

class BWM7Factory implements BWMFactory {
    public BWM productBwn() {
        return new BWM7();
    }
}

