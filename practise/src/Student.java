public class Student {
    int id;
    String name;
    int age;


    void study(){
        System.out.println("我在认真学习");
    }
    void play(){
        System.out.println("我在玩游戏！王者农药！");
    }

    public static void main(String[] args) {
        Student stu = new Student();
        stu.study();
        stu.play();
    }

}
