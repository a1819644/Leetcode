/*
Given an integer array nums, return the length of the longest strictly increasing subsequence.

        A subsequence is a sequence that can be derived
        from an array by deleting some or no elements without changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
*/

import java.util.ArrayList;

public class LongestIncreasingSubsequence {
    public static void main(String[] args){

    }

    public int lengthOfLIS(int[] nums) {
        ArrayList<ArrayList<Integer>> dp = new ArrayList<>();
        // Anything less than going to be ith value going to be disregarded
        for (int i= 0; i < nums.length; i++){

            for (int j = i; i < nums.length; j++){

            }
        }


    }
}
