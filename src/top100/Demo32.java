package top100;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Stack;

public class Demo32 {
    public int longestValidParentheses(String s){
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
        validList.sort(Comparator.naturalOrder());

    }

    public static void main(String[] args) {

    }
}
