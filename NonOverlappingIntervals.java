import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NonOverlappingIntervals {
  public static void main(String[] args) {
    int[][] intervals = {{2,50}, {2,3}, {50,51},{3,4}};
    System.out.println(eraseOverlapIntervals(intervals));
  }

  public static int eraseOverlapIntervals(int[][] intervals) {
    int countOverlappingIntervals = 0;
    ArrayList<Integer> overlaps = new ArrayList<>();
    int left = 0;
    int right =1;
    //sorting the array
    Arrays.sort(intervals, (a, b) -> Double.compare(a[0], b[0]));

    while(right < intervals.length){
        if (intervals[left][1] <= intervals[right][0]){
            left = right; //not overlapping
            right++;
        }else if(intervals[left][1] <= intervals[right][1]){
            //then it is overlapping
            right++;
            countOverlappingIntervals++;
        }else if(intervals[left][1] > intervals[right][1]){
        countOverlappingIntervals ++;
        left = right;
        right++;
        }
    }

    return   countOverlappingIntervals;
  }
}
