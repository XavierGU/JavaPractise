import java.util.Arrays;

public class Oct30th2018 {
    /* public static void main(String[] args) {
         String x = "hello";
         String y = "world";
         String z = x+y;
         System.out.println(z);
         Random r = new Random();
         System.out.println(z.length());
         System.out.println(z.charAt(r.nextInt(z.length())));
         System.out.println(z.substring(1,9));
         System.out.println(z.toUpperCase());
         System.out.println(x.equals("hello"));
         System.out.println(Integer.MAX_VALUE);
         System.out.println(Integer.MIN_VALUE);
     }*/
  /* public static void main(String[] args) {
       Person mary = new Student("Mary", 28,"u344443");
       Person Fried = new COMP1100Student("Fried", 19,"u6359309",3,6,0, 4,0,0,);
       System.out.println(Fried);
       System.out.println((int)2.7);
   }
   public class Person {
    private int age;
    private String name;
    private Gender gender;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    @Override
    public String toString(){
        return name+" "+age+" ";
    }
}
public class Student extends Person {
    private String uid;
    public Student(String name, int age, String uid){
        super(name,age);
        this.uid = uid;
    }
    public String getUid(){
        return uid;
    }
    @Override
    public String toString(){
        return super.toString()+uid;
    }
}
public class COMP1100Student extends Student{
    private int ass1;
    private int ass2;
    private int ce;
    private int lab1;
    private int lab2;
    private int mse;
    private int finalExam;
    public COMP1100Student(String name, int age, String uid, int ass1, int ass2, int ce, int lab1, int lab2, int mse, int finalExam){
        super(name, age, uid);
        this.ass1 = ass1;
        this.ass2 = ass2;
        this.ce = ce;
        this.lab1 = lab1;
        this.lab2 = lab2;
        this.mse = mse;
        this.finalExam = finalExam;
    }
    private int redeem(int mark, int max){
        return Math.max(mark,(max*finalExam)/100);
    }
   public int mark(){
        return redeem(ass1,5)+ass2+redeem(ce,5)+redeem(lab1,5)+redeem(lab2,5)+redeem(mse,5)+finalExam/2;
   }

    @Override
    public String toString(){
        return super.toString()+" with a mark of "+mark();
    }
}
*/
  /*  public static void main(String[] args) {
    int i = 5;
        do {
            System.out.println(i);
            i += 1;
        } while (i < 5);

    }*/
  /*  public static void main(String[] args) {
        int a[]={3,2,3,2,3,311111};
        for (int v:a){
            System.out.println(v);
        }
    }*/

}

