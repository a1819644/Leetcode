public interface MinsubArray {


    public static int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int j = 0;
        int i = 0;
        while(i < nums.length){
            sum += nums[i] + nums[j];
            if (sum >= target) {
               result = Math.min(result, (j + 1) - i);
               i++;
               j = i + 1;
               sum = 0;
               continue;
            }
            if(j < nums.length){
                j++;
            }else{
                j = i + 1;
            }
                       
            
            // j reaches the end of the array and still unable to reach the target 
            // then we simply return the result as we cant reach the target anymore and
            

        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        System.err.println(minSubArrayLen(7, nums));
    }
}
