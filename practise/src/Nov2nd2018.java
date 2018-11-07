import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Nov2nd2018 {
  /*  public static void main(String[] args) {
        Integer[]a = new Integer[5];
        int b = a[0];
        for (int i = 0;i <a.length;i++){
            a[i]=(int)(Math.random()*100);
            System.out.println(a[i]);
        }
        Arrays.sort(a);
        for (int i = 0;i <a.length;i++){
            System.out.println("\t"+a[i]);
        }
        Arrays.sort(a, Collections.reverseOrder());
        for (int x:a){
            System.out.println(x);

        }
        for (int max:a){
            b=max>b?max:b;
            System.out.println(b);
        }
        }*/
  public static void main(String[] args) {
      int[]a = new int[5];
      int temp;
      for (int i = 0;i <a.length;i++){
          a[i]=(int)(Math.random()*100);
          System.out.println(a[i]);
      }
      for (int i=0;i<a.length;i++){
          for (int j =0;j<a.length-1-i;j++){
              if (a[j]<a[j+1]){
                  temp = a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
              }
          }
      }
      for (int i =0;i<a.length;i++){
          System.out.println(a[i]);
      }
      }
  /*    int b = a[0];
      for (int i:a){
          b = Math.max(i,b);
          if (i>b){
              b=i;
          }
      }
      System.out.println("\t"+b);*/
}
