package leetcode_simple;

public class _进制转换 {
    public static void main(String[] args){
        int x = 12;
        int y = tentotwo(x);
        System.out.println(y);
        System.out.println(twototen(1100));

    }
    //十进制转二进制
    public static int tentotwo(int x){
        StringBuilder sb = new StringBuilder();
        while(x > 0){
            sb.append(x%2);
            x /= 2;

        }
        int y =Integer.parseInt(sb.reverse().toString()) ;
        return y;




    }
    //二进制转十进制
    public static int twototen(int x){
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        double y = 0;
        int count = sb.length();
        for (int i = count - 1;i>= 0;i--){
            if(sb.charAt(i) - 48 == 1){
                y += Math.pow(2, count-sb.length());


            }
            count ++;
        }
        return (int)y;







    }
}
