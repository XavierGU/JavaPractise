package character;

public class APHero extends Hero implements AP, mortal{
    @Override
    public void magicAttack() {
        System.out.println("魔法攻击！");
    }

    @Override
    public void die() {
        System.out.println("AP DIED");

    }
}
