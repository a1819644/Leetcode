import java.util.ArrayList;
import java.util.Arrays;


public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2};
        intersect(nums1, nums2);
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
     int[] temp = new int[nums1.length];
     int countSize = 0;
     int countSizeTemp = 0;
    int l1 = 0;
    int l2 = 0;
    if (nums1.length < nums2.length){
        l1 = nums1.length;
        l2 = nums2.length;
    }else {
        l1 = nums2.length;
        l2 = nums1.length;
    }

    for (int i = 0; i < l1; i++){
        for (int j = 0; j < l2; j++){
            if (nums1[i] == nums2[j]){
                temp[countSize] = nums1[i];
                countSize++;
                break;
            }
        }
    }

    /*printing temp*/
    for (int i = 0; i < temp.length; i++){
        System.out.println(temp[i]);
        if(temp[i] != 0){
            countSizeTemp++;
        }
    }


    int[] result = new int[countSizeTemp];
    for(int i = 0; i < countSizeTemp; i++){
        result[i] = temp[i];
        System.out.println(result[i]);
    }
    return result;
    }

}
