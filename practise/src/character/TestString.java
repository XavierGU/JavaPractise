package character;

public class TestString {
    public static void main(String[] args) {
        String password = randomString(3);
        System.out.println("the password: "+password);
        char[]guessWord = new char[password.length()];
        generatePassword(guessWord,password);

    }
    private static String randomString(int length) {
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char[] cc = new char[length];
        for (int i = 0; i < cc.length; i++) {
            int index = (int) (Math.random() * pool.length());
            cc[i]=pool.charAt(index);
        }
        String result = new String(cc);
        return result;
    }
    public static void generatePassword(char[]guessWord, String password){
        generatePassword(guessWord,0,password);
    }
    public static void generatePassword(char[]guessWord, int index, String password){
        for (short i ='0';i<='Z';i++){
            char c = (char)i;
            if (!Character.isLetterOrDigit(c))
            continue;
            guessWord[index] = c;
            if (index!=guessWord.length-1){
                generatePassword(guessWord,index+1,password);
            }else{
                String guess = new String(guessWord);
                if (guess.equals(password)){
                    System.out.println("guess: "+  guess);
                    return;
                }
            }

        }

    }
}

