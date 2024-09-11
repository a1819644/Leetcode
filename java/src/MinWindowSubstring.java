

// Brute force solution

import java.util.ArrayList;

public class MinWindowSubstring {
    static String result ;
    public static String minWindow(String s, String t) {
        int j = t.length() - 1;
        int i = 0;
        int k = 0; // jap tracker
        int MAX_VALUE = Integer.MAX_VALUE;
        while (k <=  s.length() - 2) {
            findMinWindow(s, t, i, j);
            // increase the jap tracker and increase the j = j + k
            k++;
            j = j + k;
        }
        System.err.println("result : " + result);
        return null;
    }
    private static void findMinWindow(String s, String t, int i, int j) {
        // ending the loop is necessary
        if(j >= s.length()){
            return;
        }
        // extract the substring
        char[] toCharArrayFors = s.substring(i, j + 1).toLowerCase().toCharArray();
        char[] CharArrayt = t.toLowerCase().toCharArray();
        ArrayList<Character> tArrayList = new ArrayList<Character>();

        for (Character character : CharArrayt) {
            tArrayList.add(character);
        }
        // lets match the characters
        for (Character charS : toCharArrayFors) {
            if(tArrayList.contains(charS)){
                tArrayList.remove(charS);
                continue;
            }
        }
        if(tArrayList.size() == 0) {
                result = s.substring(i, j+1);
                System.err.println("found the substring " + s.substring(i, j + 1));
        }
        findMinWindow(s, t, i+1, j+1);
    }


    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.err.println(minWindow(s, t));
    }
}
