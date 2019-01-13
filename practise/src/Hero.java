

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public Hero() {
    }
    public void heal(int red){
        hp = hp+red;
        red = 0;
    }
    public Hero(String name, float hp){
        this.name = name;
        this.hp = hp;
    }

    public static void main(String[] args) {
        Hero teemo = new Hero("teemo",353);
        int red = 100;
        teemo.heal(red);
        System.out.println(red);
    }
}