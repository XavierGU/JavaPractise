import java.util.ArrayList;
import charactor.Hero;
public class TestCollection {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();
        heros.add(new Hero("gaven"));
        System.out.println(heros.size());
        heros.add(new Hero("timo"));
        System.out.println(heros.size());
    }
}
