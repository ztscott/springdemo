package leetcode_middle;

import java.util.Stack;

public class _20goodidea {
    public static void main(String[] args) {
        String s =
                "(){}}{";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        int k = s.length()/2;
        for (int i =0;i<k;i++){
            s=s.replace("()","").replace("{}","").replace("[]", "");


        }
        return s.isEmpty();





    }

//    public static boolean isValid(String s) {
//        if(s.length()%2 != 0) return false;
//        if((s.indexOf("(") >=0 && s.indexOf(")")>=0)||(s.indexOf("[") >=0 && s.indexOf("]")>=0)||(s.indexOf("{") >=0 && s.indexOf("}")>=0)){
//            for (int i = 0;i<s.length()-1;i++){
//                int y = s.charAt(i) - s.charAt(i+1);
//                int x = Math.abs(y);
//                if(x==1||x==2||x==83||x==32||x==51||x==52||x==84
//                        ||x==50||x==82||x==34||x==53||x==30){
//                    continue;
//                }else {
//                    return false;
//                }
//            }
//        }else return false;
//
//        return true;
//    }
}
