import java.util.ArrayDeque;
import java.util.Deque;

public class MaxValueOfEquation {
    public static void main(String[] args){

    }
    public int findMaxValueOfEquation(int[][] points, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int res = Integer.MIN_VALUE;
        int i = 0;
        while(i < points.length)
        {
            while(!dq.isEmpty() && points[dq.peekFirst()][0] < points[i][0] - k)dq.pollFirst();
            if(!dq.isEmpty())
            {
                res = Math.max(res, points[i][1] + points[dq.peekFirst()][1] + points[i][0] - points[dq.peekFirst()][0]);
            }

            while(!dq.isEmpty() && points[dq.peekLast()][1] <= points[i][1] - (points[i][0] - points[dq.peekLast()][0]))dq.pollLast();
            dq.offerLast(i);
            i++;
        }

        return res;
    }
}
