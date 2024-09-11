public interface MinsubArray {


    public static int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int j = 1;
        int i = 0;
        int prev = i;
        if (nums[i] >= target) {
            return 1;
        }
        while (i < nums.length) {
            if (j < nums.length) {
                if(nums[j] >= target || nums[i] >= target) {
                    return 1;
                }
                if(prev == i){
                    sum = nums[i] + nums[j];
                }else{
                    sum += nums[j];
                }
                if(sum >= target){
                    result = Math.min(result, ((j - i) + 1));
                    i++;
                    prev = i;
                    j = i + 1;
                    sum =0;
                    continue;
                }
                
                else{
                    j++;
                    prev++;
                }
            }else{
                break;
            }
            
        }
        if(result == Integer.MAX_VALUE){
            return 0;
        }else{
            return result;
        }

    }

    public static void main(String[] args) {
        int[] nums = {7,1,100};
        System.err.println(minSubArrayLen(100, nums));
    }
}
