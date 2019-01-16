package character;

public class SPHero extends Hero implements Healer {
    @Override
    public void heal() {
        System.out.println("进行治疗！");
    }
}
