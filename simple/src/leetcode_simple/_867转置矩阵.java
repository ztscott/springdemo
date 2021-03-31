package leetcode_simple;

public class _867转置矩阵 {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1,2,3},{4,5,6}};
        int[][] arr1 = transpose(arr);
        for (int[] a:arr1
             ) {
            for (int b:a
                 ) {
                System.out.println(b);

            }

        }

    }
    public static int[][] transpose(int[][] matrix) {
        int arr[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[0].length;j++){
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;

    }
}
