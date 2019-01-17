package character;

import property.Item;
import property.lifePotion;

public class ADHero extends Hero implements AD{
    int moveSpeed = 400;

    public ADHero() {
        super("");
    }

    @Override
    public void physicalAttck() {
        System.out.println("物理攻击");
    }
    public int getMoveSpeed(){
        return this.moveSpeed;
    }
    public int getMovespeed2(){
        return super.movespeed;
    }
    public void useItem(Item i ){
        System.out.println("ADhero uses item");
        super.useItem(i);
    }

    public static void main(String[] args) {
        ADHero h = new ADHero();
        lifePotion lp = new lifePotion();
    }
}
