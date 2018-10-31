import java.util.function.IntPredicate;

public class lambda {
    static void printBig(int value, IntPredicate bigTest){
        if (bigTest.test(value)){
            System.out.println("this is big");
        }else{
            System.out.println("no, it is small");
        }
    }
    public static void main(String[] args) {
        printBig(200,x->x> 2000);
        IntPredicate bt = x->x>100;
        printBig(10,bt);
        printBig(120,bt);
    }
}
