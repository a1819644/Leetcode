import java.util.List;
import java.util.ArrayList;
import java.util.*;


public class FlowerPlantingWithNoAdjacent {
    public static void main(String[] args) {
      /*n =  5
                [[4,1],[4,2],[4,3],[2,5],[1,2],[1,5]]*/
        int[][] paths = {{1,2},{2,3},{3,1}};
        int n = 3;
   gardenNoAdj(n,paths);
    }
    public static int[] gardenNoAdj(int n, int[][] paths) {
        int[] result = new int[n];
        int differentFlowers = 0;
        //creating a graph
        List<List<Integer>> pathsList = new ArrayList<List<Integer>>();

        for (int i = 0; i < paths.length; i++){
            pathsList.add(new ArrayList<>());
        }
        for (int i = 0; i < paths.length; i++){
            pathsList.get(paths[i][0] - 1).add(paths[i][1]);
            pathsList.get(paths[i][1] - 1).add(paths[i][0]);
        }
        result = dfs(n, pathsList);
        //convert the arrayList into array
        return result;
        }


        public static int[] dfs(int n, List<List<Integer>> pathsList){
        int[] flowers = new int[n];

            // creating bfs inorder to visit numbers
            Stack<Integer> stack = new Stack<Integer>();
            Boolean[] isVisited = new Boolean[n];
            for(int i = 0; i < n; i++){
                isVisited[i] = false;
            }
            int s = 0;
            stack.push(pathsList.get(0).get(0));// adding the first node

            while(!stack.empty()){
                s = stack.peek();
                stack.pop();
                if(!isVisited[s]){
                System.out.println(s + "  ");
                isVisited[s] = true;
                }

                Iterator<Integer> itr = pathsList.get(s).iterator();
                while(itr.hasNext()){
                    int empty = itr.next();
                    if(!isVisited[empty]){
                    stack.push(empty);
                    }
                }

            }






       return flowers; }

}
