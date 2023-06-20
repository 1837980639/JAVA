import java.util.Random;

public class Angle {

//判断是否能构成三角形
    public static boolean JudgeAngle(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("能够构成三角形！");
            return true;
        } else {
            System.out.println("不能构成三角形!");
            return false;
        }
    }

//判断是否能构成等腰三角形
    public static int JudgeDangle(double a, double b, double c) {
        if (a == b || a == c || b == c) {
            if (a == b && a == c) {
                System.out.println("该三角形是等边三角形！");
                return 1;
            } else {
                System.out.println("该三角形是普通的等腰三角形！");
                return 1;
            }
        } else {
            return 0;
        }
    }


//判断是否是直角三角形
    public static int JudgeRangle(double a, double b, double c) {
        double r1, r2, r3;
        r1 = a * a + b * b - c * c;
        r2 = a * a + c * c - b * b;
        r3 = b * b + c * c - a * a;

        /*System.out.println(r1+r2+r3);*/
        if (r1 == 0 || r2 == 0 || r3 == 0) {
            System.out.println("该三角形是直角三角形！");
            return 1;
        } else {

//System.exit(0);
            return 0;
        }
    }

    public static void judgment(double a,double b,double c){
        //判断输入三边是否合法

        if (a < 0 || Double.isInfinite(a)||Double.isNaN(a) || b < 0 || Double.isInfinite(b)||Double.isNaN(a) || c < 0 || Double.isInfinite(c)||Double.isNaN(a)) {
            System.out.println("你输入的三边不合法！");
        } else {

//判断是否能构成三角形
            if(JudgeAngle(a, b, c)){

            }


//判断是否是等腰或等边三角形
            JudgeDangle(a, b, c);

//判断是否是直角三角形
            JudgeRangle(a, b, c);

//判断是一般三角形
            System.out.println("该三角形是一般三角形!");

        }
    }

    public static void main(String[] args) {
//        int a;
//        int b;
//        int c;
//        System.out.println("请输入三角形的三边: ");
//        Scanner scanner = new Scanner(System.in);
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        c = scanner.nextInt();
        int i=0;
        while (i<10000){
            double a,b,c;
            Random random=new Random();
            a = random.nextInt(10)-1;
            b = random.nextInt(10)-1;
            c = random.nextInt(10)-1;
            System.out.println(a+","+b+","+c);
            judgment(a,b,c);
            i++;
        }

    }

}