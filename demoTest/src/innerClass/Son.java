package innerClass;

public class Son {
    public void showOne(){
        new One().askOne();
    }
    public void showTwo(){
        new Two().askTwo();
    }
    class One extends FatherOne{
        @Override
        public void askOne() {
            super.askOne();
        }
    }
    class Two extends FatherTwo{
        @Override
        public void askTwo() {
            super.askTwo();
        }
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.showOne();
        son.showTwo();
    }
}
