package leetcode_middle;

public class _3not {
    public static void main(String[] args) {
        int last[] = new int[128];
        String s = "w21wqda";
        System.out.println(last[s.charAt(1)]);
        int a = lengthOfLongestSubstring(s);
        System.out.println(a);

    }
    public static int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }

        int res = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < s.length(); i++) {
            start = Math.max(start, last[s.charAt(i)] + 1);
            res   = Math.max(res, i - start + 1);
            last[s.charAt(i)] = i;
        }

        return res;


    }
}
