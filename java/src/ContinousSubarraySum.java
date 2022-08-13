public class ContinousSubarraySum {

  public static void main(String[] args) {
    int[] num = {23,2,4,6,7};

    boolean isTrue = subarraySum(num, 6);
    System.out.println(isTrue);
  }
//not solved failed some test cases

  public static boolean subarraySum(int[] nums, int k) {
    int divisibleBy = 0;
    int remainder = 0;

    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      if(divisibleBy == 0){
          return true;
      }
      for (int j = i; j < nums.length; j++) {
        sum += nums[j];
        if (sum == k) {
          return true; // solve the sum issue
        }
        remainder = sum % k;
        if(remainder == 0){
            divisibleBy = sum/k;
        }

      }
    }

    return false;
  }
}
