public class TestThis {
    int a,b,c;
    TestThis(int a,int b){
        this.a = a;
        this.b = b;
    }
    TestThis(int a, int b, int c){
        this(a,b);
        this.c = c;
    }
    void sing(){
        System.out.println("唱歌");

    }
    void eat(){
        sing();
        System.out.println("回家吃饭");
    }

    public static void main(String[] args) {
        TestThis hi = new TestThis(2,3);
        hi.eat();
    }
}
