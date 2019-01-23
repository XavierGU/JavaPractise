package digit;

public class TestNumber {
    public static void main(String[] args) {
        int i =5;
        byte b = 1;
        Byte b1 = b;
        byte b2 = b1;
        short s = 1;
        Short s1  = s;
        short s2 = s1;
        float f = 0;
        Float f1 = f;
        float f2 = f1;
        double d = 1.0;
        Double d1 = d;
        double d2 = d;
        int i2 = b1;
        System.out.println(b1.MAX_VALUE);
        System.out.println(b1.MIN_VALUE);
    }
}
