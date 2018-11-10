import java.util.Arrays;
import java.util.Random;

public class Nov3rd2018 {
/*    public static void main(String[] args) {
        int a[]= new int[]{1,3,4,2,35,3,25,3,22};
        int b[]=new int[3];
        System.arraycopy(a,0,b,0,3);
        for (int i =0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }*/
/*public static void main(String[] args) {
    Random rand = new Random();
    int a = rand.nextInt(4)+6;
    int b = rand.nextInt(4)+6;
    int c = a+b;
    int[]aa=new int[a];
    int[]bb=new int[b];
    int[]cc=new int[c];
    for (int i =0;i <aa.length;i++){
        aa[i]=(int)(rand.nextInt(100));
        System.out.println(aa[i]);
    }
    for (int i =0;i<bb.length;i++){
        bb[i]=(int)(rand.nextInt(100));
        System.out.println("\t"+bb[i]);
    }
    System.arraycopy(aa,0,cc,0,aa.length);
    System.arraycopy(bb,0,cc,aa.length,bb.length);
    for (int i =0;i<cc.length;i++){
        System.out.println(cc[i]);
    }
}*/
/*public static void main(String[] args) {
    int [][]a = new int[5][5];
    for (int i =0;i<a.length;i++) {
        for (int j = 0; j < a[i].length; j++) {
            a[i][j] = (int) (Math.random() * 100);
            System.out.println(a[i][j]);
        }
    }
    int aa=0;
    int bb=0;
    int max = 0;
    for (int i =0;i<a.length;i++){
        for (int j=0;j<a[i].length;j++){
            if (a[i][j]>max){
                max=a[i][j];
                aa=i;
                bb=j;
            }
        }
    }
    System.out.println("max"+max);
    System.out.println("a"+aa+"  "+"b"+bb);
}*/
/*public static void main(String[] args) {
    *//*int[]a=new int []{1,112,553,2224,235,63,74,23423428};
  //  int[]b= Arrays.copyOfRange(a,0,10);
  //  String content = Arrays.toString(b);
   // System.out.println(content);
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.binarySearch(a,74));
    *//*
    *//*int[]a=new int[10];
    Arrays.fill(a,5);
    System.out.println(Arrays.toString(a));*//*
    int[][]a=new int[5][8];
    for (int i =0;i<a.length;i++){
        for (int j=0;j<a[i].length;j++){
            a[i][j]=(int)(Math.random()*100);
        }
    }
    int[]b=new int[40];
    for (int i=0;i<a.length;i++){
        System.arraycopy(a[i],0,b,i*a[i].length,a[i].length);
    }
    Arrays.sort(b);
    System.out.println(Arrays.toString(b));
    for (int i=0;i<a.length;i++){
        System.arraycopy(b,i*a[i].length,a[i],0,a[i].length);
    }
    for (int i=0;i<5;i++){
        System.out.println(Arrays.toString(a[i]));
    }
}*/
}
