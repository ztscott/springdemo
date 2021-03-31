package leetcode_simple;

public class _66加一进一位 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,0};
        int arr1[] = plusOne(arr);
        for (int a:arr1
             ) {
            System.out.println(a);

        }

    }
    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] == 0){
            digits[digits.length - 1] = 1;
            return digits;
        }
        int arr[] = new int[digits.length+1];
        int arr1[] = new int[digits.length];
        for (int i = 0 ;i<digits.length;i++){
            arr[i+1] = digits[i];
        }
        int x = arr.length - 1;
        int count = 10;
        while((arr[x] + 1) == count){
            arr[x] = 0;
            x --;
            arr[x]=arr[x]+1;
            count = 11;
        }
        if (arr[arr.length - 1] != 0){
            arr[arr.length - 1] = arr[arr.length - 1]+1;
        }
        if(arr[0] == 0){
            for (int i = 0;i<digits.length;i++){
                arr1[i] = arr[i+1];
            }
        }else if (arr[0] == 1){
            return arr;
        }
        return arr1;

    }

}
