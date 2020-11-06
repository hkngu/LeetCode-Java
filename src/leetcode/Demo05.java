package leetcode;

import java.util.ArrayList;

public class Demo05 {
    static String longestPalindrome(String s){
        if (s.length()<1)
            return null;
        int left = 0;
        int right = 1;
        int leftTemp;
        int rightTemp;
        int length = 0;
        int rightMax= 0;
        int leftMax = 0;
        boolean isPalindrome = true;
        ArrayList<Character> list = new  ArrayList<>();
        for (int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        while (right<list.size()){
            while (left < right){
                if (list.get(left) == list.get(right) && length < right -left){
                    leftTemp = left;
                    rightTemp = right;
                    //判断是否是回文串
                    while (rightTemp - leftTemp >=1){
                        if (list.get(rightTemp) != list.get(leftTemp)){
                            isPalindrome = false;
                            break;
                        }else {
                            rightTemp--;
                            leftTemp++;
                            isPalindrome = true;//这里要重置判断标志为true
                        }
                    }
                    if (isPalindrome){
                        if (right-left > length){
                            length =right-left;
                            rightMax = right;
                            leftMax = left;
                        }
                        break;
                    }
                }
                left++;
            }
            left = 0;
            right++;
        }
        StringBuilder sb = new StringBuilder();
        if (length != 0){
            for (int i=leftMax;i<=rightMax;i++){
                sb.append(list.get(i));

            }
            return sb.toString();
        }else {
            return sb.append(list.get(0)).toString();//没有长度大于2以上的回文串，就返回第一个字符
        }
    }

    public static void main(String[] args) {
        String str = longestPalindrome("acbcasdasdasd");
        System.out.println(str);
    }

}
