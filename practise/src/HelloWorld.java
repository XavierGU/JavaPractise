public class HelloWorld {
    public static void main(String[] args) {
        heroType hero = heroType.PUSH;
        switch (hero){
            case TANK:
                System.out.println("坦克");
                break;
            case WIZARD:
                System.out.println("法师");
                break;
            case PUSH:
                System.out.println("推进");
                break;
            case ASSIST:
                System.out.println("辅助");
                break;
            case RANGER:
                System.out.println("远程");
                break;
            case FARMING:
                System.out.println("打野");
                break;
            case WARRIOR:
                System.out.println("战士");
                break;
            case ASSASSIN:
                System.out.println("刺客");
                break;
        }
        for (heroType h : heroType.values()){
            System.out.println(h);
        }
    }
}
