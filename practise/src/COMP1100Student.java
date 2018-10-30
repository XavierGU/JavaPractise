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

