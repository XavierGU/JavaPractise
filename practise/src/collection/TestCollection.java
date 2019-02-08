package collection;
import character.Hero;

import java.util.ArrayList;

public class TestCollection {
  /*  public static void main(String[] args) {
        Hero heros[]=new Hero[10];
        heros[0]= new Hero("gailun");
        heros[20]= new Hero("teemo");
    }*/
 /* public static void main(String[] args) {
      ArrayList heros = new ArrayList();
      heros.add(new Hero("gaulun"));
      System.out.println(heros.size());
      heros.add(new Hero("teemo"));
      System.out.println(heros.size());
  }*/
  public static void main(String[] args) {
      ArrayList heros = new ArrayList();
      for (int i = 0; i < 5; i++) {
          heros.add(new Hero("hero " + i));
      }
 /*     Hero specialHero = new Hero("Special Hero");
      heros.add(specialHero);
      heros.remove(2);
      heros.set(4,"hero 5");
      System.out.println(heros);
      System.out.println(heros.contains(new Hero("hero 1")));
      System.out.println(heros.contains(specialHero));
    // System.out.println(heros.get(6));
      //System.out.println(heros.get(5));
     // System.out.println(heros.indexOf(specialHero));
      System.out.println(heros.indexOf(new Hero("hero 1")));
      System.out.println(heros.size());*/
     /* Hero hs[]=(Hero[])heros.toArray(new Hero[]{});
      System.out.println(hs);*/
   /*  ArrayList anotherHeros = new ArrayList();
     anotherHeros.add(new Hero("hero a"));
     anotherHeros.add(new Hero("hero b"));
     anotherHeros.add(new Hero("hero c" ));
      System.out.println(anotherHeros);
      heros.addAll(anotherHeros);
      System.out.println(heros);
      heros.clear();
      System.out.println(heros);
  }*/
   String name = "hero 1";
   for (int i = 0;i<heros.size();i++){
       Hero h = (Hero)heros.get(i);
       if (name.equals(h.name )){
           System.out.println(name);
           break;
       }
   }
  }
}
