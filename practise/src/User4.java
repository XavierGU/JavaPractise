public class User4 {
    int age;
    String name;
    String company;

    public User4(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void testForParemeter(User4 u){
        u.name = "kkk";
    }

    public static void main(String[] args) {
        User4 u1 = new User4(20,"dd");
        System.out.println(u1.name);
        u1.testForParemeter(u1);
        System.out.println(u1.name);
    }
}
