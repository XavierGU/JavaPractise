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
