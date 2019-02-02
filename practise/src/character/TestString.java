package character;

public class TestString {
    public static void main(String[] args) {
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
    String sentence = " has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
    int lastTwo = sentence.lastIndexOf("two");
        System.out.println(lastTwo);
    char[]cs = sentence.toCharArray();
    for (int i = 0;i<cs.length;i++){
        cs[lastTwo]=Character.toUpperCase(cs[lastTwo]);
    }
    String result = new String(cs);
        System.out.println(result);
    }
    }



