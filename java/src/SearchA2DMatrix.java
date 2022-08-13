import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Medium type question Leet code
public class SearchA2DMatrix {
  public static void main(String[] args) {
    int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
    int target = 121;
    System.out.println(searchMatrix(matrix, target));
  }

  public static boolean searchMatrix(int[][] matrix, int target) {
   /* converting 2d matrix into 1d matrix */
    int[] temp = Stream.of(matrix)  //we're now IntStream, just collect the ints to array.
                .flatMapToInt(IntStream::of)//we I'll map each int[] to IntStream
                .toArray();//we're now IntStream, just collect the ints to array.
    List<Integer> result = new ArrayList<>(temp.length); // created ArrayList cause it has .contains method
     /*inserting temp values int result */
    for (int i : temp) {
      result.add(i);
    }
    //finally, returning true or false if the arrayList contains the target value
    return result.contains(target);
  }
}
