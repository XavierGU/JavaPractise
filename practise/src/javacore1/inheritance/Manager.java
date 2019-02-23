package javacore1.inheritance;

public class Manager extends Employee {
    private double bouns;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bouns = 0;
    }
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary+=bouns;
    }
    public void setBouns(double b){
        bouns = b;
    }
}
