import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums= {-1,0,3,5,9,12};
    System.out.println(search(nums, 3));

    }
    static int result = 0;
    public static int search(int[] nums, int target) {

        int middleElement = nums.length / 2;
        if(nums[middleElement] == target){
            return middleElement;
        }
       if(nums[middleElement] > target){
           //check the left side
           int[] temp = Arrays.copyOfRange(nums, 0,  middleElement);
           search(temp, target);
           if(nums[middleElement] == target){
               result =  middleElement - 1;
           }
       }else{
           //check the right side
           int[] tem1 = Arrays.copyOfRange(nums, middleElement ,  nums.length - 1);
           search(tem1, target);
           if(nums[middleElement] == target){
               result =  middleElement - 1;
           }
       }

    return result;
    }


}
