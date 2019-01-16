package property;

public class Item {
    String name;
    int price;
    private Item(){
    }
    private static Item sword ;
    public static Item getSword(){
        if (null == sword){
            sword = new Item();
        }
        return sword;
    }
}
