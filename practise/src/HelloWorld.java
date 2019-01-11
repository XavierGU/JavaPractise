public class HelloWorld {
    public static void main(String[] args) {
        int []a = new int[5];
        for (int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*100);
            System.out.println(a[i]);
        }
        int min =a[0];
        for (int j = 0;j<a.length;j++){
            if (a[j]<min){
                min = a[j];
            }
        }
        System.out.println(min);
    }
}
