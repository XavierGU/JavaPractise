package character;
import property.Item;
import property.magicPotion;
import property.lifePotion;

public class Hero {
   String name;
   float hp;
   float armor;
   int movespeed;
    public void useItem(Item i){
        i.effect();
    }
    public void kill(mortal m){
        m.die();

    }
   public static void main(String[] args) {
     Hero garen = new Hero();
     garen.name = "gailun";
     lifePotion lp = new lifePotion();
     magicPotion mp = new magicPotion();
     garen.useItem(lp);
     garen.useItem(mp);
     ADHero AD = new ADHero();
     APHero AP = new APHero();
     ADAPHero ADAP = new ADAPHero();
     garen.kill(AD);
     garen.kill(AP);
     garen.kill(ADAP);
   }
}