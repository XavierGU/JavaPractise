import java.util.ArrayList;
import java.util.Arrays;

import charactor.Hero;
public class TestCollection {

 public static void main(String[] args) {
     ArrayList heros = new ArrayList();
     for (int i = 0;i<5;i++){
         heros.add(new Hero("hero"+i));
     }
     System.out.println(heros);
     Hero specialHero = new Hero("special hero");
     heros.add(3,specialHero);
     heros.set(4,new Hero("new hero"));
     Hero hs[]=(Hero[])heros.toArray(new Hero[]{});
     System.out.println(heros);
     System.out.println(heros.contains(specialHero));
     System.out.println(hs.length);
     heros.addAll(Arrays.asList(hs));
     System.out.println(heros);
 }
}
