package javacore1;

public class ParamTest {
    public static void main(String[] args) {
        System.out.println("Testing triplevalue");
        double precent = 10;
        System.out.println("Before: precent="+precent);
        tripleValue(precent);
        System.out.println("After: precent="+precent);

        System.out.println("\nTest tripleSalary");
        Employee harry = new Employee("Harry",50000);
        System.out.println("Before: salary="+harry.getSalary());
        tripleSalary(harry);

        System.out.println("After: salary="+harry.getSalary());

        System.out.println("\nTesting swap");
        Employee a = new Employee("Alice",20000);
        Employee b = new Employee("Bob", 60000);
        System.out.println("Before: a="+a.getName());
        System.out.println("Before: b="+b.getName());
        swap(a,b);
        System.out.println("After: a="+a.getName());
        System.out.println("After: b="+b.getName());
    }
    public static void tripleValue(double x){
        x = 3*x;
        System.out.println("End of method: x="+x);
    }
    public static void tripleSalary(Employee x){
        x.raiseSalary(200);
        System.out.println("End of method: salary="+x.getSalary());
    }
    public static void swap(Employee x, Employee y){
        Employee temp = x;
        x=y;
        y=temp;
        System.out.println("End of Method: x="+x.getName());
        System.out.println("End of Method: y="+y.getName());
    }
}
class Employee {
    private String name;
    private double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        this.salary += raise;
    }

}
