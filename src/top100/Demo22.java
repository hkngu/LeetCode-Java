package top100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Demo22 {
    private StringBuilder sb = new StringBuilder();
    private ArrayList<String> list  = new ArrayList<>();
    //深度优先遍历(dfs)的实践
    public List<String> generateParenthesis(int n){
        addStr(n,"(",0,0);
        return list;
    }

    private void addStr(int n,String str,int left,int right){
        //一条路径到头了，但是可能不是我们需要的结果
        if (left == n && str.equals("("))
            return;
        if (right == left && str.equals(")"))
            return;
        sb.append(str);
        if (str.equals("("))
            left++;
        else
            right++;
        if (right == n && left == n){
            list.add(sb.toString());
            sb.deleteCharAt(sb.length()-1);//删掉最后一个元素
            return;
        }
        addStr(n,"(",left,right);
        addStr(n,")",left,right);
        sb.deleteCharAt(sb.length()-1);
    }
}
