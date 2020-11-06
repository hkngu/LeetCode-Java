package leetcode;

import java.util.Stack;

public class Demo20 {
    public boolean isValid(String s){
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : arr){
            if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (c == '(')
                stack.push(')');
            else {
                if(stack.isEmpty() || c != stack.pop())//如果在遍历过程中遇到了反括号，栈中没有元素了，说明匹配失败，如果出栈正括号不匹配，也说明匹配失败
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
