package character;

public class GiantDragon {
    private GiantDragon(){

    }
    private static GiantDragon instance = new GiantDragon();
    public static GiantDragon getInstance(){
        if (null == instance){
            instance = new GiantDragon();
        }
        return instance;
    }
}
