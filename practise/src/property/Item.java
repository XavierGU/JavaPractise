package property;

public class Item {
    String name;
    int price;

    public void buy(){
        System.out.println("购买");
    }
    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }

    public static void main(String[] args) {
        Item i = new Item();
        i.effect();
        lifePotion lp = new lifePotion();
        lp.effect();
        magicPotion mp = new magicPotion();
        mp.effect();
    }

}
