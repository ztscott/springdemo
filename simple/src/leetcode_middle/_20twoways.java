package leetcode_middle;

import java.util.Stack;

public class _20twoways {
    public static void main(String[] args) {
        String s =
                "(){}}{";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        if (s.length()==0) return true;
        Stack<Character> stack = new Stack();
        for (Character ch:s.toCharArray()) {
            if(ch =='('||ch=='['||ch=='{'){
                stack.push(ch);
            }else {
                if (stack.isEmpty()){
                    return false;
                }else {
                    char temp = stack.pop();
                    if(temp=='('){
                        if (ch!=')') return false;
                    }else if (temp=='['){
                        if (ch!=']') return false;
                    }else if (temp=='{'){
                        if (ch!='}') return false;
                    }
                }
            }


        }
        return stack.isEmpty();



    }

}
