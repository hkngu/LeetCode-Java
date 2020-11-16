package top100;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo39 {
    List<List<Integer>> results = new ArrayList<>();
    List<Integer> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates,int target){
        //先将数组进行排序
        Arrays.sort(candidates);
        getResults(candidates,target,0);
        return results;
    }

    private void getResults(int[] candidates, int target, int index) {//传一下下标，或者使用for循环
        //没找到符合条件的
        if(index == candidates.length)
            return;
        //找到了 满足条件
        if(target == 0){
            results.add(new ArrayList<>(result));//不能直接添加result到results  result为引用，List里的内容一直在改变
            return;
        }
        //因为数组经过排序 当target比当前下标对应的元素小，说明这条路径找不到满足条件的结果了
        if (target<candidates[index])
            return;
        result.add(candidates[index]);
        getResults(candidates,target-candidates[index],index);
        result.remove(result.size()-1);
        getResults(candidates,target,index+1);
    }
}
