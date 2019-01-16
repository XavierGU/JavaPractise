package character;

public class Hero {
   String name;
   float hp;
   float armor;
   int movespeed;

   public static void main(String[] args) {
     ADHero ad = new ADHero();
     APHero ap = new APHero();

     Hero h1 = ad;
     Hero h2 = ap;
      System.out.println(h2 instanceof ADHero);
      System.out.println(h1 instanceof APHero);
      System.out.println(h1 instanceof Hero);
   }
}