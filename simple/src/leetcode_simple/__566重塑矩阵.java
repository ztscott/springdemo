package leetcode_simple;

public class __566重塑矩阵 {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1,2},{3,4},{5,6}};
        int arrtrans[][] = matrixReshape(arr,3,2);
        for(int i=0;i<arrtrans.length;i++){
            for(int j=0;j<arrtrans[0].length;j++){
                System.out.print(arrtrans[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int an[][] = new int[r][c];
        int count = 0;
        if(r*c != nums.length*nums[0].length){
            return nums;
        }else{
            for(int i=0;i<an.length;i++){
                for(int j=0;j<an[0].length;j++){
                    an[i][j] = nums[count/nums[0].length][count%nums[0].length];//
                    count++;

                }

            }
        }

        return an;

    }
}
