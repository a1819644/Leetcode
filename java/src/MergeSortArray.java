import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortArray {
    public static void main(String[] args){
     int[]  nums1 = {4,5,6,0,0,0};
     int[] nums2 = {1,2,3};
     int m = 3;
     int n = 3;
     merge(nums1,m,nums2,n);
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m; i < nums1.length; i++){
            if(n != 0){
            nums1[i] = nums2[n - 1];
            n--;
            }else break;
        }
        Arrays.sort(nums1);

        for (int i = 0; i < nums1.length; i++){
      System.out.println(nums1[i]);
        }
    }


}
