import java.util.Arrays;

/*1498. Number of Subsequences That Satisfy the Given Sum Condition*/
public class NumberofSubsequencesThatSatisfytheGivenSumCondition {
    public static void main(String[] args) {
        int[] nums = {3,3,6,8};
        int target = 10;
    System.out.println(numSubseq(nums, target));

    }

    public static int numSubseq(int[] nums, int target) {
        final int MODULO = 1000000007;
        int length=nums.length;
        Arrays.sort(nums);
        int[] power2 = new int[length + 1];
        power2[0] = 1;
        for (int i = 1; i <= length; i++)
            power2[i] = (power2[i - 1] * 2) % MODULO;
        int l=0; int r=length-1; int ans=0;
        while(l<=r){
            if(nums[l]+nums[r]<=target){
                ans=(ans+power2[r-l])%MODULO;
                l+=1;
            }else{
                r-=1;
            }
        }

        return ans;
    }

}
