import java.util.Arrays;

public class MinimumMovestoReachTargetScore {
    public static void main(String[] args) {

    }
    public static int minMoves(int target, int maxDoubles) {
        if(target==1) return 0;
        if(target%2 != 0) return 1 + minMoves(target-1, maxDoubles);
        if(maxDoubles >0) return 1 + minMoves(target/2, maxDoubles-1);
        else return target-1;
    }
}
