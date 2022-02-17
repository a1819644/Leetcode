//867 easy
public class TransposeMatrix {
    public static void main(String[] args) {
       int[][] nums1 =  {{1,2,3},{4,5,6},{7,8,9}};
    transpose(nums1);
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] new2dMatrix = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++){
            for (int j = i; j < matrix.length; j++){
                new2dMatrix[j][i] = matrix[i][j];
                System.out.println(new2dMatrix[i][j]);
            }
        }

    return new2dMatrix;
    }
}
