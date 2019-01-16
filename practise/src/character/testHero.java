package character;

public class testHero {


    public static void main(String[] args) {
        Hero g1 = Hero.getGaren();
        Hero g2 = Hero.getGaren();
        Hero g3 = Hero.getGaren();
        System.out.println(g1 == g2);
        System.out.println(g2 == g3);
    }
}
