package factory;

public class FMain {
    public static void main(String[] args) {
        BWM F3 = new BWM3Factory().productBwn();
        BWM F5 = new BWM5Factory().productBwn();
        BWM F7 = new BWM7Factory().productBwn();

        F3.showInfo();
        F5.showInfo();
        F7.showInfo();
    }
}
