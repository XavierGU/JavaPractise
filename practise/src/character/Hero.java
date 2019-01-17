package character;


import property.Item;

public class Hero {
   String name;
   float hp;
   float armor;
   int movespeed;
 public void useItem(Item i){
     System.out.println("hero use item");
     i.effect();
 }
 /*public Hero(){
     System.out.println("hero 的方法");
 }*/
 public Hero(String name){
     System.out.println("Hero 的方法，有一个参数");
     name = "king";
     this.name = name;

 }

    public static void main(String[] args) {
        new Hero("de");
    }
}