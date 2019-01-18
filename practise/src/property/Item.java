package property;

public class Item {
    String name;
    int price;
    public String toString(){
        return name+price;
    }
    public void finalize(){
        System.out.println("物品正在被回收");
    }
    public boolean equals(Object k){
            if (k instanceof Item){
                Item j =(Item)k;
                return this.price == j.price;
                }
            return false;
            }



    public static void main(String[] args) {
        Item j = new Item();
        j.name = "kk";
        j.price = 100;
        System.out.println(j.toString());
        for (int i = 0;i<5;i++){
            j = new Item();
        }
        Item j1 = new Item();
        j1.price = 150;
        Item j2 = new Item();
        j2.price = 200;
        Item j3 = new Item();
        j3.price = 150;
        System.out.println(j1.equals(j3));
        System.out.println(j2.equals(j3));
    }

}
