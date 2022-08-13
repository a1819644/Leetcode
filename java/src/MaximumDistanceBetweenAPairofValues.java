import java.util.ArrayList;
import java.util.Collections;

public class MaximumDistanceBetweenAPairofValues {
    public static void main(String[] args) {
        int[]  nums1 = {25,25,25,25,25};
        int[] nums2 = {30,29,19,5};
    System.out.println("pass " + maxDistance(nums1, nums2));
    }

    public static int maxDistance(int[] nums1, int[] nums2)   {
        int res = 0;
    int j = nums2.length - 1;
    for (int i = nums1.length - 1; i != -1; i--) {
        while (j >= i && nums2[j] < nums1[i])
            j--;
        res = Math.max(res, j - i);
    }
    return res;}
}
//implement binary search
// then do the implementation
  /*  public int maxDistance(int[] nums1, int[] nums2) {
        int max_dis = 0;

        int i = 0;

        while(i < nums1.length){
            int l = i;
            int r = nums2.length-1;

            while(l <= r){
                int mid = l+(r-l)/2;

                if(nums2[mid] >= nums1[i]){
                    max_dis = Math.max(mid-i, max_dis);
                    l = mid+1;
                }
                else
                    r = mid-1;
            }
            i++;
        }
        return max_dis;
    }*/

