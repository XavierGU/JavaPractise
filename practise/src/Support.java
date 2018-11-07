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
    }
}
