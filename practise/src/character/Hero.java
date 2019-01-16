package character;

public class Hero {
   String name;
   float hp;
   float armor;
   int movespeed;
   private Hero(){
   }
   private static Hero garen = new Hero();
   public static Hero getGaren(){
       return garen;
   }
}