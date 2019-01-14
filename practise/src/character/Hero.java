package character;

public class Hero {
    public String name;
    protected float hp;
    static String copyRight;

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "garen";
        Hero.copyRight = "riot";
        System.out.println(garen.name);
        System.out.println(garen.copyRight);
        Hero teemo = new Hero();
        teemo.name = "teemo";
        System.out.println(teemo.name);
        System.out.println(teemo.copyRight);
    }
}
