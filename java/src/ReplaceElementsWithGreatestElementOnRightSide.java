import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args){
        replaceElements(new int[]{17,18,5,4,6,1});


    }

    public static int[] replaceElements(int[] arr) {
        int tmp = -1;
        int N = arr.length-1;
        for (int i = N; i >= 0; i--) {
            int next = Math.max(arr[i],tmp);
            arr[i] = tmp;
            tmp = next;
        }
        return arr;
    }
}