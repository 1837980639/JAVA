package reflect;

public class Student extends Person implements Move,Study{

    String school;
    int age;
    public Student(){
        System.out.println("调用构造方法");
    }
    public Student(String school){
        this.school = school;
        System.out.println("调用构造方法Student(String school)");
    }
    private Student(String school, int age){
        this.school = school;
        this.age = age;
        System.out.println("调用构造方法 Student(String school, int age)");
    }

    public void showInfo(){
        System.out.println("学校是" + this.school);
    }
    @Override
    public void moveType() {
        System.out.println("开宝马上学");
    }

    @Override
    public void study() {
        System.out.println("学习java知识");
    }
}
