public class Student {
    int id;
    String name;
    int age;
    Computer comp;

    void study(){
        System.out.println("我在认真学习！使用电脑"+comp.brand);
    }
    void play(){
        System.out.println("我在玩游戏！王者农药！");
    }

    public static void main(String[] args) {
        Student stu = new Student();
        stu.id = 001;
        stu.name = "GSQ";
        stu.age = 20;

        Computer c1 = new Computer();
        c1.brand = "Lenonvo";
        stu.comp = c1;
        stu.study();
        stu.play();
    }
}
class Computer{
    String brand;
}