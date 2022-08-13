import java.util.Arrays;

public class MinimumNumberofMovesToSeatEveryone {
    public static void main(String[] args) {
    System.out.println(minMovesToSeat(new int[]{4,1,5,9}, new int[]{1,3,2,6}) );

    }
    public static int minMovesToSeat(int[] seats, int[] students) {
    int result = 0;
    Arrays.sort(seats);
    Arrays.sort(students);
    int max = Math.max(seats.length, students.length);
    for (int i = 0; i < max; i++) {
        if(students[i]  < seats[i] ){
            result += seats[i] - students[i];
        }else{
            result += students[i] -  seats[i];
        }

    }

    return result;
    }

}
