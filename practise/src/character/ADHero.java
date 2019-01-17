package character;

public class ADHero extends Hero implements AD, mortal{
    @Override
    public void physicalAttck() {
        System.out.println("物理攻击");
    }

    @Override
    public void die() {
        System.out.println("AD DIED");

    }
}
