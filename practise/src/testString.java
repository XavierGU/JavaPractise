public class testString {
    public static void main(String[] args) {
        String s = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
        int index = s.lastIndexOf(" two ");
        System.out.println(index);
        char[]cs = s.toCharArray();
        cs[index+1]=Character.toUpperCase(cs[index+1]);
        String result = new String(cs);
        System.out.println(cs);
    }
}
