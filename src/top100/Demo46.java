package top100;

import java.util.ArrayList;
import java.util.List;

public class Demo46 {
    List<List<Integer>> results =  new ArrayList<>();
    List<Integer> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums){
        if (nums == null || nums.length<1)
            return results;
        getResults(nums,0,new int[nums.length]);
        return results;
    }

    private void getResults(int[] nums, int index ,int[] temp) {//temp数组用来标记nums中哪个元素被使用过了
        if (index == nums.length){
            results.add(new ArrayList<>(result));//这里需要重新new一个list 容易忘
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (temp[i] == 1)
                continue;
            result.add(nums[i]);
            temp[i] = 1;
            getResults(nums,index+1,temp);
            temp[i] = 0;
            result.remove(result.size()-1);
        }
    }
}
