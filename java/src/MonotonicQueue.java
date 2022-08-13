import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MonotonicQueue {
    public static void main(String[] args) {
        firstSmaller(new int[] {5, 3, 1, 2, 4});
    }
    public  static int[][] firstSmaller(int[] nums) {
        int[] leftSmaller = new int[nums.length];
        int[] rightSmaller = new int[nums.length];
        Arrays.fill(leftSmaller, -1);
        Arrays.fill(rightSmaller, -1);
        Deque<Integer> queue = new LinkedList<>(); // increasing queue
        for (int i = 0; i < nums.length; i++) {    // left to right
            while (!queue.isEmpty() && nums[queue.peekLast()] >= nums[i]) {
                rightSmaller[queue.pollLast()] = nums[i];
            }
            if (!queue.isEmpty()) {
                leftSmaller[i] = nums[queue.peekLast()];
            }
            queue.offerLast(i);
        }

        return new int[][]{leftSmaller, rightSmaller};
    }
}
