

import javax.swing.*;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;

public class oct11st2018 {
 /*   public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
         int age;
         int height;
         int inch;
         int weight;

        System.out.print("how old are you?");
        age = keyboard.nextInt();

        System.out.print("how tall are you?");
        height = keyboard.nextInt();

        System.out.print("and how many inches?");
        inch = keyboard.nextInt();

        System.out.print("how much do you weight?");
        weight = keyboard.nextInt();

        System.out.println("So you are "+age+" and "+height+"'"+inch+"''"+" and "+weight+" heavy.");
    }
}*/
/* public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     String name;
     int age;
     double salary;

     System.out.println("Hello, what is yout name?");
     name = keyboard.next();

     System.out.println("Hi " +name+" how old are you?");
     age = keyboard.nextInt();

     System.out.println("So you are "+age);
     System.out.println("How much do you make, "+name);
     salary = keyboard.nextDouble();
     System.out.println(salary+", wow!");
 }*/
/* public static void main(String[] args) {
     GregorianCalendar dow = new GregorianCalendar();
     int cal = dow.get(GregorianCalendar.DAY_OF_WEEK);
     System.out.println("today is "+cal+"!");
 }*/
/* public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     String name;
     int age;
     System.out.println("Hey, how old are you?");
     age = keyboard.nextInt();
     System.out.println("Sorry, what is your name?");
     name = keyboard.next();
     System.out.println("Ok, "+name+" you are "+age);
     if (age<=16){
         System.out.println("you cannot drive,"+name);
     }else if (age>16&&age<18){
         System.out.println("you can drive but not to vote, "+name);
     }else if(age>=18&&age<25){
         System.out.println("you can vote but not rent a car, "+name);
     }else{
         System.out.println("you can do everything, "+name);
     }
 }*/
 /*public static void main(String[] args) {
     int correctCount = 0;
     Scanner answer = new Scanner(System.in);
     System.out.println("Are you ready for a quiz?");
     String one = answer.next();
     System.out.println("OK, here it comes!");
     System.out.println(" \n \n \n Q1) What is the capital of Alaska? \n \t 1) Melbourne \n \t 2) Anchorage \n \t 3) Juneau ");
     int a1 = answer.nextInt();
     if (a1 == 3) {
         System.out.println("That's right!");correctCount++;
     }
     else {
         System.out.println(" You are wrong! the answer is 3) Juneau");
     }
     System.out.println(" \n \n \n Q2) Can you store the value \"cat\" in the variable of type int? \n \t 1) Yes \n \t 2) No ");
     int a2 = answer.nextInt();
     if (a2 == 2)
     {
         System.out.println("That's right!");correctCount++;
     }
     else
     {
         System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
     }
     System.out.println(" \n \n \n Q3) What is the result of 9+6/3? \n \t 1) 5 \n \t 2) 11 \n \t 3) 15/3 ");
     int a3 = answer.nextInt();
     if (a3 == 2)
     {
         System.out.println("That's right!");correctCount++;
     }
     else
     {
         System.out.println("Sorry, the answer is 11.");
     }
     System.out.println("Overall, you got "+correctCount+" out of 3 correct!");
 }*/
/* public static void main(String[] args) {
     String name = JOptionPane.showInputDialog("What is your name?");

     String input = JOptionPane.showInputDialog("How old are you?");
     int age = Integer.parseInt(input);
     System.out.println("Hello "+name);
     System.out.println("next year you will be "+(age+1));
    // System.exit(0);
 }*/
}