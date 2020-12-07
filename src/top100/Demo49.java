package top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Demo49 {
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String,List<String>> map = new HashMap<>();
        List<String> list = null;
        for (String str:strs){
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = Arrays.toString(array);//这里一定要转为字符串
            if(map.containsKey(key)){
                map.get(key).add(str);
            }else {
                list = new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
