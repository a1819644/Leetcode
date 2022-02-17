public class TwoSum {

    public static void main(String[] args) {
      int[] num ={3,2,4};
     int[] sumResult = twoSum(num, 6);
      for (int i = 0; i < sumResult.length; i++){
      System.out.println(sumResult[i]);
      }
    }

    public static int[] twoSum(int[] num, int target){

        for(int i = 0; i< num.length; i++){
            for(int j = i + 1; j< num.length; j++){
                if(target==num[i] + num[j]){
                    int[] result={i,j};
                    return result;
                }
            }
        }
        return null;
    }

}
