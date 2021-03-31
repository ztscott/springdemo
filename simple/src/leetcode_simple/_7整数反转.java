package leetcode_simple;

public class _7整数反转 {
    public static void main(String[] args) {
        int a = reverse(169);
        System.out.println(a);
    }
    public static int reverse(int x) {
        long y = 0;
        while(x != 0){
            y = y*10 + x%10;
            x = x/10;
        }
        return (int)y == y?(int)y:0;


    }
}
