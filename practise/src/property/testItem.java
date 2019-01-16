package property;

public class testItem {
    public static void main(String[] args) {
        Item g1 = Item.getSword();
        Item g2 = Item.getSword();
        Item g3 = Item.getSword();
        System.out.println(g1 == g2);
        System.out.println(g2 == g3);
    }
}
