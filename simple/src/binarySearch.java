public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {14,23,35,63,85,92,100};
        rank(35,arr);
    }
        private static int rank(int key,int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while(low <= high){
            mid = (low + high)/2;
            if(key < arr[mid]){ //向数组的左边去查找
                high = mid - 1;
            }else if(key > arr[mid]){//向数组的右边去查找
                low = mid + 1;
            }else {
                System.out.println(mid);
                return mid;
            }
        }
        return -1;
    }

}
