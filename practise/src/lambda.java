import java.util.function.IntPredicate;

public class lambda {
    /*static void printBig(int value, IntPredicate bigTest){
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
public class Test {*/
    public static void main(String[] args){
        // 实例化泛型类
        Point<Integer, Integer> p1 = new Point<Integer, Integer>();
        p1.setX(10);
        p1.setY(20);
        int x = p1.getX();
        int y = p1.getY();
        System.out.println("This point is：" + x + ", " + y);

        Point<Double, String> p2 = new Point<Double, String>();
        p2.setX(25.4);
        p2.setY("hello world");
        double m = p2.getX();
        String n = p2.getY();
        System.out.println("This point is：" + m + ", " + n);
    }
}
// 定义泛型类
class Point<T1, T2>{
    T1 x;
    T2 y;
    public T1 getX() {
        return x;
    }
    public void setX(T1 x) {
        this.x = x;
    }
    public T2 getY() {
        return y;
    }
    public void setY(T2 y) {
        this.y = y;
    }
}
