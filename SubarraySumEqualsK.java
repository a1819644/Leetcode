public class SubarraySumEqualsK {
  public static void main(String[] args) {
    int[] num = {1,-1,1,3,4,2};//[1,-1,0]

    int subarray = subarraySum(num, 4);
    System.out.println(subarray);
  }

    public static int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k ){
                    count++;
                }
            }
        }

        return count;
    }
}



