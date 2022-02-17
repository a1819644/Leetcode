import java.util.ArrayList;
import java.util.Collections;

public class GetBiggestThreeRhombusSumsInAGrid {
    public static void main(String[] args) {
        getBiggestThree(new int[][]{{20,17,9,13,5,2,9,1,5},
                                    {14,9,9,9,16,18,3,4,12},
                                    {18,15,10,20,19,20,15,12,11},
                                    {19,16,19,18,8,13,15,14,11},
                                    {4,19,5,2,19,17,7,2,2}});
    }
    public static int[] getBiggestThree(int[][] grid) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] endResult = new int[3];
       int count = 0;

        for (int[] i : grid) {
            for (int j : i) {
                list.add(j);
            }
        }
        Collections.sort(list);
    if (grid.length != 1 ) {
      for (int i = 0; i < grid.length - 2; i++) {
        for (int j = 1; j < grid[i].length - 1; j++) {
                  list.add(grid[i][j] + grid[i + 1][j - 1] + grid[i + 1][j + 1] + grid[i + 2][j]);
        }
      }
}


    for (int i = list.size() - 1; i >= list.size() - 3; i--) {
      endResult[count] = list.get(i);
      count++;
       }
        System.out.println(list);
       if(endResult[0] == endResult[1] && endResult[1] == endResult[2]){
           return new int[]{endResult[0]};
       }else{
           return   endResult;
       }


    }
}
