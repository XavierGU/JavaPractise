package character;

import java.util.Scanner;

public class TestChar {
   /* public static void main(String[] args) {
        char c1 = 'a';
        Character c2 = c1;
        char c = c2;
        System.out.println(Character.isAlphabetic('a'));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }*/
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String str = in.nextLine();
       char[]c = str.toCharArray();
       for (int i = 0;i<c.length;i++){
           if (Character.isDigit(c[i])||Character.isUpperCase(c[i])){
               System.out.print(c[i]);
           }else{
               continue;
           }
       }

   }

}
