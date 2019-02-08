package character;


import property.Item;

public class Hero implements LOL {
   public String name;
   public float hp;
   public float armor;
   public int damage;
  public int movespeed;
/* public void useItem(Item i){
     System.out.println("hero use item");
     i.effect();
 }
 *//*public Hero(){
     System.out.println("hero 的方法");
 }*//*
 public Hero(String name){
     System.out.println("Hero 的方法，有一个参数");
     name = "king";
     this.name = name;

 }*/
/*
public boolean equals(Object o) {
    if (o instanceof Hero) {
        Hero h = (Hero) o;
        return this.hp == h.hp;
    }
    return false;
}

    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.hp = 300;
        Hero h2 = new Hero();
        h2.hp = 400;
        Hero h3 = new Hero();
        h3.hp = 300;
        System.out.println(h1==h2);
        System.out.println(h1==h3);
    }
*/
public Hero(){}
public Hero(String name){
    this.name=name;
}
public String toString(){
    return name;
}

}