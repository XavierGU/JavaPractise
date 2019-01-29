package character;

import java.util.Arrays;

public class TestString {

    public static void main(String[] args) {
        String[]str= new String[8];
        for (int i = 0;i<str.length;i++){
            String randomString = randomString(5);
            str[i]= randomString;
        }
        System.out.println("排序前");
        System.out.println(Arrays.toString(str));
        for (int i = 0; i<str.length;i++){
            for (int j = 0;j<str.length-i-1;j++){
                char firstCase1 = str[j].charAt(0);
                char firstCase2 = str[j+1].charAt(0);
                firstCase1 = Character.toLowerCase(firstCase1);
                firstCase2 = Character.toLowerCase(firstCase2);
                if (firstCase1>firstCase2){
                    String temp = str[j];
                    str[j]= str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        System.out.println("排序后");
        System.out.println(Arrays.toString(str));
    }
    private static String randomString (int length){
        String pool = "";
        for (short i = '0';i<='9';i++){
            pool+=(char)i;
        }
        for (short i = 'a'; i<='z';i++){
            pool += (char)i;
        }
        for (short i = 'A';i<='Z';i++){
            pool += (char)i;
        }
        char[]ca = new char[length];
        for (int i= 0; i < ca.length;i++){
            int index = (int)(Math.random()*pool.length());
            ca[i]=pool.charAt(index);
        }
        String result = new String(ca);
        return result;
    }

}
