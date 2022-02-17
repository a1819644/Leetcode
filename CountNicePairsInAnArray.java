import java.util.HashMap;
import java.util.Map;

public class CountNicePairsInAnArray {
   public static void main(String[] args) {
        countNicePairs(new int[]{42,11,1,97});
    }

    public static int countNicePairs(int[] nums) {
        int mod = 1000000000+7;
        int ans=0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i] - reverse(nums[i]);
            int countNicePairs = map.getOrDefault(val,0);
            if(map.containsKey(val)){
                map.put(val, countNicePairs+1);


            }else{
                map.put(val,countNicePairs + 1);
            }
            ans += countNicePairs;

        }
        ans = ans % mod;
    System.out.println(ans);

        return ans;
    }
    private static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
