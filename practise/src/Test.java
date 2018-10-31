public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.test("hello","hi");
        t.test("good morning","good night");
    }
    public void test(String...body){
        for (String string :body){
            System.out.println(string);
        }
    }
}
