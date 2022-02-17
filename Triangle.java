import java.util.*;


public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(-1);
        list.add(a1);
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(2);
        a2.add(3);
        list.add(a2);
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(1);
        a3.add(-1);
        a3.add(-3);
        list.add(a3);
        ArrayList<Integer> a4 = new ArrayList<Integer>();
        a4.add(4);
        a4.add(1);
        a4.add(8);
        a4.add(3);
        list.add(a4);
    System.out.println(
        minimumTotal(list));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
       /*   [2]
            [3,4]
           [6,5,7]
          [4,1,8,3]*/
       //solving this problem using dp
        int row = triangle.size();
        int col = triangle.get(row-1).size();

        int[][] dp = new int[row][col];

        for(int i=0;i<col;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        return traverse(triangle,0,0,dp);

    }


    private static int traverse(List<List<Integer>> triangle, int row, int idx, int[][] dp){
        if(row>=triangle.size()){
            return 0;
        }

        if(row==triangle.size()){
            return triangle.get(row).get(idx);
        }

        if(dp[row][idx]!=Integer.MAX_VALUE){
            return dp[row][idx];
        }

        int ans= Integer.MAX_VALUE;

        ans=Math.min(ans,traverse(triangle,row+1,idx,dp));
        ans=Math.min(ans,traverse(triangle,row+1,idx+1,dp));

        dp[row][idx]= ans+triangle.get(row).get(idx);
        return dp[row][idx];
    }
}
