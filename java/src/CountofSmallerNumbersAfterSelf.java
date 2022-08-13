import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CountofSmallerNumbersAfterSelf {
    public static void main(String[] args){
        int[] nums = {-1};
        System.out.println(countSmaller(nums));
    }

    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int j = i + 1;
                 if (nums[j] < nums[i]){
                     count++;
                 }


             result.add(count);
             count = 0;
        }


        return result;
    }

}
