public class Support extends Hero {
    public void heal(){
        System.out.println(name +"不知道治疗了谁");
    }
    public void heal(Hero ...heroes){
        for (int i = 0;i<heroes.length;i++){
            System.out.println(name+"治疗了"+heroes[i].name);
        }
    }

    public static void main(String[] args) {
        Support soroka = new Support();
        soroka.name = "索拉卡";
        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";
        soroka.heal(h1,h2);
    }
}

