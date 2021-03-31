package leetcode_simple;

public class _9回文数 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(3553));
    }
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        int z = 0;
        z = x;
        int y = 0;
        while(z != 0){
            y = y*10 + z%10;
            z = z/10;
        }
        return y == x;




//        if(y == x) return true;
//        else return false;


    }
}
