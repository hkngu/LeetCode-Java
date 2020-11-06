package top100;

import java.util.ArrayList;
import java.util.List;

public class Demo17 {

    private StringBuilder sb = new StringBuilder();
    private List<String> list = new ArrayList<>();
    public List<String> letterCombinations(String digits){
        //典型递归问题
        if (digits == null || digits.length()<1){
            return list;
        }
        addStr(0,digits);
        return list;
    }

    private void addStr(int index, String digits){
        //因为一个数字代表一个字符，此时StringBuilder中存放的就是我们需要的结果之一
        if (sb.length() == digits.length()){
            list.add(sb.toString());
            return;
        }
        String s = getStr(digits.charAt(index));

        for (int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            addStr(index+1,digits);
            sb.deleteCharAt(sb.length()-1);//每次循环最后，删掉StringBuffer中最后一个元素
        }
    }

    private String getStr(char c) {
        switch (c){
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
            default:
                return "";
        }

    }


    public static void main(String[] args) {
        Demo17 demo = new Demo17();
        List<String> list = demo.letterCombinations("");
        System.out.println(list.toString());
    }

}
