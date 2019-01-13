

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public Hero(){}
    public Hero(String name){
        this.name = name;
    }
    public Hero(String name, float hp, float armor, int moveSpeed){
        this(name);
        this.hp = hp;
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }

    public static void main(String[] args) {
        Hero Tww = new Hero("teemo",350,54,255);
        System.out.println(Tww.name);
    }
}