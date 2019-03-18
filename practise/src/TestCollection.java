import java.util.ArrayList;
import charactor.Hero;
public class TestCollection {
 /*   public static void main(String[] args) {
        ArrayList heros = new ArrayList();
        heros.add(new Hero("gaven"));
        System.out.println(heros.size());
        heros.add(new Hero("timo"));
        System.out.println(heros.size());
    }*/
 public static void main(String[] args) {
     ArrayList heros = new ArrayList();
     for (int i = 0;i<5;i++){
         heros.add(new Hero("hero"+i));
     }
     System.out.println(heros);
     Hero specialHero = new Hero("special hero");
     heros.add(3,specialHero);
     System.out.println(heros);
 }
}
