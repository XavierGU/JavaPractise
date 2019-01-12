public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public Hero(String heroName,float heroHP, float heroArmor, int heroMoveSpeed){
        name = heroName;
        hp = heroHP;
        armor = heroArmor;
        moveSpeed = heroMoveSpeed;
    }
    public static void main(String[] args) {
        Hero Garen = new Hero("Garen",714,70,340);
    }
}
