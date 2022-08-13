import java.util.ArrayList;
import java.util.*;




public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(5);
    }
    public static List<String> fizzBuzz(int n) {
        // create array of size n
         List<String> result = new ArrayList<String>();
        // for loop till n times = > i
        for(int i = 1; i <= n ; i ++){
            int localThree = i % 3;
            int localFive  = i % 5;
            if( localThree ==  0 && localFive ==0){result.add("FizzBuzz");}
            else if(  localThree == 0){ result.add("Fizz");}
            else if ( localFive == 0){result.add("Buzz");}
            else{
               result.add(String.valueOf(i));
            }
        }
    System.out.println(result);
    return result;
    }
    }
