package digit;

public class TestNumber {
    public static void main(String[] args) {
        float f = 3.14f;
        String str = String.valueOf(f);
        String str2 = "3.1a4";
        Float f1 = Float.parseFloat(str2);
        System.out.println(f1);

    }
}
