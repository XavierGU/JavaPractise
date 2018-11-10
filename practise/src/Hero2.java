public class Hero2 {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public Hero2(){}
    public void huixue(int xp){
        hp = hp+xp;
        xp=0;
    }
    public Hero2(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
    public void revive(Hero2 h){
        h = new Hero2("提莫",383);
    }
    public static void main(String[] args) {
       Hero2 teemo = new Hero2("提莫",383);
       teemo.hp = teemo.hp-400;
       teemo.revive(teemo);
        System.out.println(teemo.hp);
    }
}
