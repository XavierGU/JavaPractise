public class TestOverload {
    public static void main(String[] args) {
        TestOverload tm = new TestOverload();
        System.out.println(add(3,5));
        System.out.println(add(3,5,10));
        System.out.println(add(5.0,2));

    }
    public static int add(int n1,int n2){
        int sum = n1+n2;
        return sum;
    }
    public static int add(int n1, int n2, int n3){
        int sum = n1+n2+n3;
        return sum;
    }
    public static double add(double n1, int n2){
        double sum = n1+n2;
        return sum;
    }
}
