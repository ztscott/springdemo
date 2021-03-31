public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {14,3,5,13,5,12,24};
        int[] arr1 = Bubble(arr);
        for (int i:arr1
             ) {
            System.out.println(i);

        }
    }

    private static int[] Bubble(int arr[]) {
        for (int i = 0 ;i < arr.length - 1;i++){
            for (int j = 0;j < arr.length - 1;j++){
                if(arr[j] < arr[j+1]){
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;

                }

            }

        }
        return arr;
    }

}
