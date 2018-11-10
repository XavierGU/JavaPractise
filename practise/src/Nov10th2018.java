public class Nov10th2018 {
   /* public class Hero {
        String name;
        float hp;
        float armor;
        int moveSpeed;
    }
    public class HealSupport extends Hero implements Heal{
    @Override
    public void heal() {
    }
}
    public interface Heal {
    public void heal();
}
public class APHero extends Hero implements AP {
    @Override
    public void magicAttack() {

    }
}
public interface AP {
    public void magicAttack();
}
public class ADHero extends Hero implements AD {
    @Override
    public void physicAttack() {
        System.out.println("物理攻击");
    }
}
public class ADAPHero extends Hero implements AD,AP{
    @Override
    public void physicAttack() {
    }
    @Override
    public void magicAttack() {
    }
}
public interface AD {
    public void physicAttack();
}
public class Item {
    String name;
    int price;
    public void buy(){
        System.out.println("购买");
    }
    public void effect(){
        System.out.println("有效果");
    }
    public static void main(String[] args) {
        Item i = new Item();
        i.effect();
        lifePotion lf = new lifePotion();
        lf.effect();
        manaPotion mp = new manaPotion();
        mp.effect();
    }
}
public class manaPotion extends Item {
    public void effect(){
        System.out.println("可以回魔法");
    }
}
public class lifePotion extends Item {
    public void effect(){
        System.out.println("可以回血");
    }
}
public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public void useItem(Item i ){
        i.effect();
    }
    public static void main(String[] args) {
        Hero garen = new Hero();
        Hero teemo = new Hero();
        lifePotion lp = new lifePotion();
        manaPotion ma = new manaPotion();
        garen.useItem(lp);
        teemo.useItem(lp);
        teemo.useItem(ma);
    }
}
public interface Mortal {
    public void die();
}
public static void battleWin(){
        System.out.println("AD hero battle win");
    }
    public static void main(String[] args) {
     Hero.battleWin();
     ADHero.battleWin();
     Hero h = new ADHero();
     h.battleWin();
    }
        public String name;
    protected float hp;
public boolean equals(Object o ){
    if (o instanceof  Hero){
        Hero h = (Hero)o;
        return this.hp == h.hp;
    }
    return false;
}
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.hp = 300;
        Hero h2 = new Hero();
        h2.hp = 400;
        Hero h3 = new Hero();
        h3.hp = 300;
        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));*/

}
