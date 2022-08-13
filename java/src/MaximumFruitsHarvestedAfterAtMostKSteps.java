import java.util.ArrayList;
import java.util.Arrays;

public class MaximumFruitsHarvestedAfterAtMostKSteps {
    static  int  positionForR;
    public static void main(String[] args) {
    maxTotalFruits(new int[][]{{2,8},{6,3},{8,6}}, 5, 4);

    }
    public static int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int left = Math.max(startPos - k, 0);
        int right = startPos;
        int res = 0;
        // binary search to find the the leftmost point.
        int leftId = Arrays.binarySearch(fruits, new int[]{left, 0}, (a, b) -> a[0] - b[0]);
        if (leftId  < 0) {
            leftId  = -leftId  - 1;
        }
        if (leftId  == fruits.length) {
            return 0;
        }
        // finding the right boundary
        int rightId = leftId ;
        // harvest all the fruits not exceeding the startPos
        while (rightId  < fruits.length && fruits[rightId][0] <= startPos) {
            res += fruits[rightId][1];
            ++rightId;
        }
        // make a copy for sliding window without losing the potential max
        int cur = res;
        // right boundary should not exceed startPos + k as the start point is startPos and the max # of steps is k.
        while (rightId  < fruits.length && fruits[rightId ][0] <= startPos + k) {
            // visiting next rightmost point
            right = fruits[rightId][0];
            // harvest fruits
            cur += fruits[rightId][1];

            while (leftId < rightId) {
                int r = right - startPos;
                int l = startPos - fruits[leftId][0];
                // find minium steps to reach both ends
                int dist = 0;
                if (r < l) {
                    dist = 2 * r + l;
                } else {
                    dist = 2 * l + r;
                }
                // check if we can reach the leftmost point. If not, move the left end
                if (dist > k) {
                    cur -= fruits[leftId++][1];
                } else {
                    break;
                }
            }

            res = Math.max(res, cur);
            // move the right boundary in the iteration
            rightId++;
        }
        return res;
    }
    /*public static int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int[] fruitList = new int[fruits[ fruits.length -1][0]];
        Arrays.fill(fruitList, 0);
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < fruits.length; i++){
            int index = fruits[i][0];
            if (index >= startPos - k  && index <= startPos + k ){
                fruitList[index -1] = fruits[i][1];
            }
        }

        //sliding window technique
        int abs = Math.abs(startPos - k);
        for(int i = abs; i < fruitList.length - startPos + k; i++)

        return 0;
    }
*/
   /* private static int functionRight(int[][] fruits, int startPos, int endPos) {
        int sum = 0;
        for (int i = positionForR; i < fruits.length; i++){
            int index = fruits[i][0];
            if (index >= startPos  && endPos >= index ){
                sum += fruits[i][1];
            }
            if( index > endPos){
                break;
            }

        }
        System.out.println(sum);
        return sum;



    }
*/


}
