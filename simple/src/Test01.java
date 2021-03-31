import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,2,2,6,3};
        int[] myarr = findRepeat(arr1,arr2);
        for (int l:myarr
             ) {
            System.out.println(l);

        }
    }

    private static int[] findRepeat(int arr1[],int arr2[]) {
        int i = 0;
        int j = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        List<Integer> myarr = new ArrayList<>();

        while(i < arr1.length && j < arr2.length){
            if (arr1[i] == arr2[j]){
                myarr.add(arr1[i]);
            }
            else if(arr1[i] > arr2[j]){
                j++;
                continue;
            }else if(arr1[i] < arr2[j]){
                i++;
                continue;
            }
            i++;
            j++;
        }
        int[] result = new int[myarr.size()];
        for (int k = 0;k < myarr.size();k++){
            result[k] = myarr.get(k);
        }
        return result;

    }
}
