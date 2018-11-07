public class Nov7th2018 {
    /*public class Item {
        String name;
        int price;
    }
    public class Weapon extends Item {
        int damage;
        public static void main(String[] args) {
            Weapon duoLan = new Weapon();
            duoLan.damage = 10;
            duoLan.name = "DUOLAN";
            duoLan.price = 470;
        }
        public class Armor extends Item {
            int aLevel;
            public static void main(String[] args) {
                Armor suoZiJia = new Armor();
                suoZiJia.aLevel = 30;
                suoZiJia.name = "SuoZiJia";
                suoZiJia.price = 500;
            }
            public class Hero {
                String name;
                float hp;
                float armor;
                int moveSpeed;
                public static void main(String[] args) {
                    Hero garen = new Hero();
                }
            }
            public class ADHero extends Hero {
                public void attack(){
                    System.out.println(name+"进行了一次攻击");
                }
                public void attack(Hero...heroes){
                    for (int i = 0;i<heroes.length;i++){
                        System.out.println(name+"攻击了"+heroes[i].name);
                    }
                }
                public static void main(String[] args) {
                    ADHero bh = new ADHero();
                    bh.name = "赏金猎人";
                    Hero h1 = new Hero();
                    h1.name = "盖伦";
                    Hero h2 = new Hero();
                    h2.name = "提莫";
                    bh.attack(h1);
                    bh.attack(h1,h2);
                }
                public class Support extends Hero {
    public void heal(){
        System.out.println(name+"进行了一次治疗");
    }
    public void heal(Hero...heroes){
        for (int i = 0;i<heroes.length;i++){
            System.out.println(name+"治疗了"+heroes[i].name);
        }
    }
    public void heal(Hero H,int hp){
        System.out.println(name+"治疗了"+H.name+hp+"血");
    }
    public static void main(String[] args) {
        Support QY = new Support();
        QY.name = "琴女";
        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "寒冰";
        QY.heal(h1,40);
    }*/
}
