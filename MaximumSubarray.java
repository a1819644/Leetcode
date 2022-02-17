import java.util.HashSet;
import java.util.Set;

public class MaximumSubarray {
  public static void main(String[] args) {
    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(nums));

  }


  // Kadanes Algorithm
  public static int maxSubArray(int[] nums) {
    int sum = 0;
    int max = Integer.MIN_VALUE;
      for (int v = 0; v < nums.length; v++){
        sum += nums[v];
        if (sum < nums[v]) {
            sum = nums[v];
        }
        if (max < sum ){
            max = sum;
        }
    }
  return max;
  }
}
