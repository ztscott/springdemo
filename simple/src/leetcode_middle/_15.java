package leetcode_middle;

import java.lang.reflect.Array;
import java.util.*;

public class _15 {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,0,2,4,2,-2};
        List<List<Integer>> list = threeSum(nums);
        for (List<Integer> a:list
             ) {
            for (Object b:a
                 ) {
                System.out.println(b);

            }

        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List listz = new ArrayList();
        List listf = new ArrayList();
        for (int k = 0;k<nums.length - 1;k++){
            if(nums[k]>=0){
                listz.add(nums[k]);
            }else listf.add(nums[k]);
        }
        Set<List<Integer>> list = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        int a = nums.length/2;
        int b = nums.length;
        for (int j =a;j<b;j++){
            for (int i=0;i<a;i++){
                if (-nums[i] == nums[j-1] + nums[j]){
                    list1.add(nums[i]);
                    list1.add(nums[j-1]);
                    list1.add(nums[j]);
                    list.add(list1);

//                    nums[i] = nums[nums.length-1];
//                    nums = Arrays.copyOf(nums, nums.length-1);
//                    nums[j] = nums[nums.length-1];
//                    nums = Arrays.copyOf(nums, nums.length-1);
//                    nums[j-1] = nums[nums.length-1];
//                    nums = Arrays.copyOf(nums, nums.length-1);
//                    a = nums.length/2;
//                    b = nums.length;
                    for (List<Integer> h:list
                    ) {
                        for (Object o:h
                        ) {
                            System.out.println(o);

                        }

                    }

                }

            }
        }




        return new ArrayList<>(list);



    }

}
