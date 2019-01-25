package character;

import java.util.Arrays;

public class TestString {
    public static void main(String[] args) {
        String[]ss = new String[8];
        for (int i = 0;i<ss.length;i++){
            String randomString = randomString(5);
            ss[i]= randomString;
        }
        System.out.println("未排序");
        System.out.println(Arrays.toString(ss));
        for (int j = 0;j<ss.length;j++){
            for (int k = 0;k<ss.length-j-1;k++){
                char firstChar1 = ss[k].charAt(0);
                char firstChar2 = ss[k+1].charAt(0);
                firstChar1 = Character.toLowerCase(firstChar1);
                firstChar2 = Character.toLowerCase(firstChar2);
                if (firstChar1>firstChar2) {
                    String temp = ss[k];
                    ss[k] = ss[k + 1];
                    ss[k + 1] = temp;
                }
            }
        }
        System.out.println("已排序");
        System.out.println(Arrays.toString(ss));
    }
    private static String randomString (int length){
        String pool = "";
        for (short i = '0';i<='9';i++){
            pool += (char)i;
        }
        for (short i = 'a';i<='z';i++){
            pool+=(char)i;
        }
        for (short i = 'A';i<='Z';i++){
            pool+=(char)i;
        }
        char[]cc = new char[length];
        for (int i=0;i<cc.length;i++){
            int index = (int)(Math.random()*pool.length());
            cc[i]=pool.charAt(index);
        }
        String str = new String(cc);
        return str;
    }
}
