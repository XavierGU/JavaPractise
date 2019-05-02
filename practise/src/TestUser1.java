public class TestUser1 {
    int age;
    String name;
    static String company="KFC";
    public TestUser1(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println(name);
    }
    public static void getCompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {
        TestUser1 use = new TestUser1("kk");
        use.getName();
        use.getCompany();
    }
}
