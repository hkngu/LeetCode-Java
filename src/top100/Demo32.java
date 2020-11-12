package top100;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Stack;

public class Demo32 {
    static int longestValidParentheses(String s){
        if (s == null || s.length()<=0)
            return 0;
        char[] array = s.toCharArray();
        ArrayList<Integer> validList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<array.length;i++){
            if (array[i] == '('){
                stack.push(i);//存入正括号下标
            }else {
                if (!stack.isEmpty()){
                    validList.add(i);
                    validList.add(stack.pop());
                }
            }
        }
        //找出最长连续数列的长度
        int left= 0;
        int right = 1;
        int maxLen = 0;
        validList.sort(Comparator.naturalOrder());
        System.out.println(validList.toString());
        while (right<validList.size()){
            if (validList.get(right) != validList.get(right-1)+1){
                left = right;
            }else {
                maxLen= Math.max(maxLen,right-left+1);//找到连续的数列时，再计算长度，长度为right-left+1
            }
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses(")(()())))"));
    }
}
