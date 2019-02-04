package character;

public class TestString {
    // public static void main(String[] args) {
    // String sentence = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
        /*char c = sentence.charAt(0);
        System.out.println(c);
        String subString1 = sentence.substring(3);
        System.out.println(subString1);
        String subString2 = sentence.substring(3,5);
        System.out.println(subString2);*/
        /*String subSentences[]= sentence.split(",");
        for (String sub : subSentences){
            System.out.println(sub);
    }*/
    //System.out.println(sentence.trim());
       /* System.out.println(sentence.toLowerCase());
        System.out.println(sentence.toUpperCase());
*/
        /*System.out.println(sentence.indexOf('8'));
        System.out.println(sentence.indexOf("超神"));
        System.out.println(sentence.lastIndexOf("了"));
        System.out.println(sentence.indexOf(',',5));
        System.out.println(sentence.contains("击杀"));*/
        /*String temp = sentence.replaceAll("击杀","被击杀");
        System.out.println(temp);
        temp = temp.replaceAll("超神","超鬼");
        System.out.println(temp);
        temp = temp.replaceFirst(",","");
        System.out.println(temp);*/
      /*  String sentence =  "peter piper picked a peck of pickled peppers";
       // System.out.println(sentence.toUpperCase());
        System.out.println(sentence);
        String[]words = sentence.split(" ");
        int count = 0;
        for (int i = 0;i<words.length;i++) {
            String word = words[i];
            char firstWord = word.charAt(0);
            if (firstWord == 'p') {
                count++;
            }
        }
        System.out.printf("一共有%d个P",count);*/
      /*cs[cs.length-1]=Character.toUpperCase(cs[cs.length-1]);
        String result = new String(cs);
        System.out.println(result);*/
       /* String s = "lengendary";
        char[]cs = s.toCharArray();
        for (int i = 0;i<cs.length;i+=2) {
            if (i % 2 == 0) {
                cs[i] = Character.toUpperCase(cs[i]);
            }
        }
      String result = new String(cs);
        System.out.println(result);
        }*/
  /*  String sentence = " has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
    int lastTwo = sentence.lastIndexOf("two");
        System.out.println(lastTwo);
    char[]cs = sentence.toCharArray();
    for (int i = 0;i<cs.length;i++){
        cs[lastTwo]=Character.toUpperCase(cs[lastTwo]);
    }
    String result = new String(cs);
        System.out.println(result);
    }*/
/*   public static void main(String[] args) {
       String str1 = "the light";
       String str2 = new String(str1);
       String str3 = str1.toUpperCase();
       System.out.println(str1 == str2);
       System.out.println(str1.equals(str2));
       System.out.println(str1.equals(str3));
       System.out.println(str1.equalsIgnoreCase(str3));
   }*/
  /* public static void main(String[] args) {
       String str1 = "the light";
       String start = "the";
       String end = "light";
       System.out.println(str1.startsWith(start));
       System.out.println(str1.endsWith(end));
   }*/
    private static String randomString(int length){
        String pool = "";
        for (short i = '0';i<='9';i++){
            pool+=(char)i;
        }
        for (short i = 'a';i<='z';i++){
            pool+=(char)i;
        }
        for (short i = 'A';i<='Z';i++){
            pool+=(char)i;
        }
        char[]cc = new char[2];
        for (int i = 0;i<cc.length;i++){
            int index = (int)(Math.random()*pool.length());
            cc[i]=pool.charAt(index);
        }
        String result = new String(cc);
        return result;
    }

    public static void main(String[] args) {
        String[]random = new String[100];
        for (int i = 0 ;i<random.length;i++){
            random[i]=randomString(2);
        }
        for (int i = 0;i<random.length;i++){
            System.out.print(random[i]+" ");
            if (19==i%20){
                System.out.println();
            }
            for (String s1:random){
                int repeat=0;
                for (String s2:random){
                    if (s1.equalsIgnoreCase(s2)){
                        repeat++;
                    if (2==repeat) {
                        putIntoDuplicated(s1);
                        break;
                    }
                    }
                }

            }
        }
        System.out.printf("有%d个相同的%n",pos);
        if (pos != 0) {
            System.out.println("分别是: ");
            for (int i = 0;i<pos;i++){
                System.out.print(foundDuplicatedString[i]+" ");

            }
        }

    }
    static int pos;
    static String foundDuplicatedString[]=new String[100];
    private static void putIntoDuplicated(String s){
        for (int i = 0;i<pos;i++){
            if (foundDuplicatedString[i].equalsIgnoreCase(s))
                return;
        }
        foundDuplicatedString[pos++]=s;
    }
    }







