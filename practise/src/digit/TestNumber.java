package digit;

public class TestNumber {
       /* float f1 = 5.4f;
        float f2 = 5.5f;
        System.out.println(Math.round(f1));
        System.out.println(Math.round(f2));
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*10));
        System.out.println(Math.sqrt(9));
        System.out.println((int)(Math.pow(2,4)));
        System.out.println(Math.PI);*/
        /*System.out.println(Math.E);
        long[]maxN = new long[]{Byte.MAX_VALUE, Short.MAX_VALUE, Integer.MAX_VALUE,Long.MAX_VALUE};
        for (long n : maxN){
            double e = Math.pow(1+1d/n,n);
            System.out.println(e);
        }*/
    /*    private static boolean isPrime(int i){
            for (int j = 2;j<Math.sqrt(i);j++){
                if (0==i%j)
                    return false;
            }
            return true;
        }

    public static void main(String[] args) {
        int max = 10000*1000;
        int count =0;
        for (int i = 1;i<=max;i++){
            if (isPrime(i))
                count++;
        }
        System.out.println(count);
    }*/
       public static void main(String[] args) {
           String name = "garen";
           int kill = 8;
           String title = "legendary";
           String sentenceFormat = "%s has constantly killed %d times, earns %s %n ";
           System.out.printf(sentenceFormat,title,kill,name);
       }


}
