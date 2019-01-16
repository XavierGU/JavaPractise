package character;

public class Hero {
    public String name = "some hero";

    {
        System.out.println(name);
    }

    public Hero() {
        name = "two hero";
        System.out.println(name);
    }

    {
        name = "one hero";
        System.out.println(name);
    }

    public static void main(String[] args) {


        Hero teemo = new Hero();
        System.out.println(teemo.name);
    }

}