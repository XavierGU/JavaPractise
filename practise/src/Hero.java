public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
public Hero(String heroname){
    name = heroname;
}
public Hero(String heroname,float heroHp){
    name = heroname;
    hp = heroHp;
}
public Hero(String heroname,float heroHp,float heroArmor,int heroMoveSpeed){
    name = heroname;
    hp = heroHp;
    armor = heroArmor;
    moveSpeed = heroMoveSpeed;
}
    public static void main(String[] args) {
        Hero garen = new Hero("盖伦");
        Hero teemo = new Hero("提莫",350);
        Hero J4 = new Hero("嘉文四世",400,79,355);
    }
}
