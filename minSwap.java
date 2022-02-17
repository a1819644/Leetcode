import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class minSwap {
    private static final Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    public static void main(String[] args) {
        minSwapsCouples(new int[]{0,1,2,3});
    }


public static int minSwapsCouples(int[] row) {
    int countSwaps = 0;
 for (int i =0; i < row.length; i++){
     map.put(row[i],i); //storing the values and index
 }

 for (int i = 0; i < row.length; i+=2){
    int first = row[i];
      int second = first + (row[i] % 2 == 0 ? 1 : -1);

      if (row[i+1] != second){
          countSwaps ++;
          swap(row, i+1, map.get(second));
      }

 }

    System.out.println(countSwaps);

  return countSwaps;
 }

    private static void swap(int[] row, int i, int j) {
    int temp = row[i];
    row[i] = row[j];
    row[j] = temp;

    map.put(row[i], i);
    map.put(row[j], j);

    }


}
