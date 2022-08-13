import java.util.ArrayList;

public class ConvertIntegerToTheSumOfTwoNo_zeroIntegers {
    public static void main(String[] args) {
        int n = 100;
        getNoZeroIntegers(n);

    }

    public static boolean containsZero(int num) {
        while (num != 0) {
            int dig = num % 10;

            if (dig == 0) {
                return true;
            }

            num /= 10;
        }

        return false;
    }
    public static int[] getNoZeroIntegers(int n) {
        for (int num = 1; num <= (n >> 1); num += 1) {
            int first = num;
            int second = n - num;

            if (!containsZero(first) && !containsZero(second)) {
                return new int[] {
                        first,
                        second
                };
            }
        }

        return new int[] {
                -1,
                -1
        };
    }

}
