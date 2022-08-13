import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
    System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        //faster solution
        Set<Integer> set = new HashSet<Integer>();
        for(int v : nums){
            set.add(v);
        }
        return nums.length != set.size();
      //slower approach
     /* solution took too much time o(n2)
      for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }*/
    }
}
