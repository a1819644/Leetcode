import java.util.Stack;

public class RotateArray {
    public static void main(String[] args) {
        rotate(new int[]{1,2}, 3);
    }

    public static void rotate(int[] nums, int k) {
        int[] result = new int[nums.length];

        int realK =  k % nums.length;
        int countK = realK; //copying the realK value
        int temp = 0;

        //push everything inside the stack
        Stack<Integer>  stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            stack.push(nums[i]);
        }

        while (realK != 0){
            result[realK-1] = stack.pop();
            realK--;
        }

        for (int i = countK; i < nums.length; i++) {
            result[i] = nums[temp];
           temp++;
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
      System.out.println(result[i]);
        }

    }

}
