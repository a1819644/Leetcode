import java.util.Random;

public class ScambleString {
    static Boolean canScramble = false;
    public static void main(String[] args) {
       isScramble("great", "rgeat");
    System.out.println(canScramble);
    }

    public static boolean isScramble(String s1, String s2) {
        String fakeSubs1 = s1;
        String fakeSubs2 = s2;
        int i = 0;
        Random rand = new Random();

        if(s1.length() < 1){
            return true;
        }
        int randValue = rand.nextInt(s1.length());
        if (fakeSubs2 + fakeSubs1 == s2){
            canScramble = true;
        }

            //decided not to swap
           fakeSubs1 = s1.substring(0,randValue);
           fakeSubs2 = s2.substring(randValue,s1.length());
           boolean wannaSwap = rand.nextBoolean();
           if (wannaSwap == true){
               isScramble(fakeSubs1, fakeSubs2);
               // decided to swap the string
           }else {
               isScramble(fakeSubs2, fakeSubs1);
           }





    return canScramble;
    }
}
