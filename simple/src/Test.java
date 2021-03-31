import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int nums[] ={1,3,-1,2,-3,0};
        int[] arr = new int[6];
        int[] arr1 = new int[6];
        for (int k = 0;k<nums.length - 1;k++){
            if(nums[k]>=0){
                arr[k] = nums[k];
            }else arr1[k] = nums[k];
        }
        for (int a:arr
             ) {
            System.out.println(a);

        }
        for (int b:arr1
        ) {
            System.out.println(b);

        }


    }



}
