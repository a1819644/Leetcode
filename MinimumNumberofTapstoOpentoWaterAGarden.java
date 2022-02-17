import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MinimumNumberofTapstoOpentoWaterAGarden {
    public static void main(String[] args) {
        minTaps(5,new int[] {3,4,1,1,0,0} );
    }


    public static int minTaps(int n, int[] ranges) {
    int min = 0;
    int max = 0;
    int open = 0;

    while (max <n){
        for (int i = 0; i < ranges.length; i++) {
            if(i-ranges[i] <= min && i+ranges[i] > max){
                max = i+ranges[i];
            }
        }
        if(min == max){
            return -1 ;
        }
        open = open + 1;
        min = max;
    }


    return  open++;
    }
}
