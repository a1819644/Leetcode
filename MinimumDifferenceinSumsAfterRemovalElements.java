import java.util.ArrayList;
import java.util.Collections;
 // to do: program not working
public class MinimumDifferenceinSumsAfterRemovalElements {
    static long minimumDifference= 0;
    private static boolean isOn = false;

    public static void main(String[] args){
        minimumDifference(new int[]{16,46,43,41,42,14,36,49,50,28,38,25,17,5,18,11,14,21,23,39,23});
    }
    public static long minimumDifference(int[] nums) {
       ArrayList<Integer>  inputs = new ArrayList<Integer>();
       ArrayList<Integer>  result = new ArrayList<Integer>();

      inputs = adding(inputs, nums);
      recursively(inputs, nums.length/3);
    System.out.println(minimumDifference);
    return minimumDifference;
    }


    static void recursively(ArrayList<Integer> nums, int n){
        ArrayList<Integer> leftSub = new ArrayList<Integer>();
        ArrayList<Integer> rightSub = new ArrayList<Integer>();
        ArrayList<Integer> subArrayL = new ArrayList<Integer>();
        ArrayList<Integer> subArrayR = new ArrayList<Integer>();
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();

        int ifEven = 0;

        if(nums.size() % 2 == 0 ){ //base case
            leftSub =  copyingArrayList(nums,0, nums.size()/2);
            subArrayL =copyingArrayList(nums,0, nums.size()/2);
           rightSub =  copyingArrayList(nums,nums.size()/2, nums.size());
            subArrayR = copyingArrayList(nums,nums.size()/2, nums.size());
        }else {
           leftSub = copyingArrayList(nums,0, nums.size()/2 + 1 );
           subArrayL = copyingArrayList(nums,0, nums.size()/2 + 1 );
            rightSub =  copyingArrayList(nums,nums.size()/2 + 1, nums.size());
            subArrayR = copyingArrayList(nums,nums.size()/2 + 1, nums.size());
            ifEven =1;
        }

        //sorting
        Collections.sort(subArrayL);
        Collections.sort(subArrayR);

        //go l and then go r and then l and .....
        //now the magic time
        if( isOn == true){ //that's means subArrays' got even length and should work only three times
            //pick from the right
             //delete the first one
            rightSub.remove(subArrayR.get(0));
            System.out.println("l = " +rightSub);
            n--;
            isOn = false;
        }else {
            //pick from the left
            leftSub.remove(subArrayL.get(subArrayL.size() - 1));
            System.out.println("r = " +leftSub);
            n--;
            isOn = true;
        }

        newArrayList.addAll(leftSub);
        newArrayList.addAll(rightSub);
        if (n < 1){
            minimumDifference = minDi(newArrayList);
            return;
        }
        //calling recursively now
      recursively(newArrayList,n);


    }

    private static int minDi(ArrayList<Integer>subArray){

        int left=0;
        int right=0;
        for(int i = 0; i < subArray.size(); i++){
            if (i < subArray.size()/2){
                left += subArray.get(i);
            }else{
                right += subArray.get(i);
            }
        }


        return left - right;
    }

    static ArrayList<Integer> copyingArrayList(ArrayList<Integer> list, int firstIndex, int lastIndex){
        ArrayList<Integer> copyList = new ArrayList<Integer>();
        for (int i = firstIndex; i < lastIndex; i++){
            copyList.add(list.get(i));
        }
        return copyList;
    }
    static ArrayList<Integer> adding(ArrayList<Integer> to, int[] from) {
        for(int i : from){
            to.add(i);
        }
    return to;
    }
}
