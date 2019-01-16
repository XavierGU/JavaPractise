package character;

public class ADHero extends Hero implements AD {
    @Override
    public void physicalAttck() {
        System.out.println("物理攻击");
    }
}
