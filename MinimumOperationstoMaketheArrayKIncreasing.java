import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MinimumOperationstoMaketheArrayKIncreasing {
    public int kIncreasing(int[] arr, int k) {
    /*
      0 1 2 3 4 5 6 7 8 9
      k=4
      0 -> 4 -> 8
      1 -> 5 -> 9
      2 -> 6

      0 1 2 3 4
      0->1->2->3->4 =4 Apply LIS 0(nlogn) to find the longest increasing sequence or
       min no of elements that need to be changed to have Increasing sequence



      0 1 2 3 4 5
      4 1 5 2 6 2

      0->3   1
      1->4
      2->5   1=2

    */
        List<List<Integer>>res=new ArrayList<>();

        for(int i=0;i<k;i++){
            res.add(new ArrayList<>());
        }

        for(int i=0;i<arr.length;i++){
            if(i < k)
                res.get(i).add(arr[i]);
            else
                res.get(i%k).add(arr[i]);
        }
        int cnt=0;

        for(List<Integer>l:res){
            cnt +=LIS(l);
        }

        return cnt;

    }
    public int  LIS(List <Integer> ar){            //0(nlogn)
        int[]bs=new int[ar.size()+1];
        Arrays.fill(bs,Integer.MAX_VALUE);
        bs[0]=Integer.MIN_VALUE;

        int max=1;
        for(int val : ar){
            int l=0;
            int h=ar.size();

            while(l<=h){
                int mid=(l+h)/2;

                if(bs[mid] <= val)
                    l=mid+1;
                else
                    h=mid-1;
            }
            bs[l]=val;
            max=Math.max(max,l);
        }

        return ar.size()-max;

    }
}
