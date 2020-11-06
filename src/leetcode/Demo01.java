package leetcode;

import java.util.HashMap;

public class Demo01 {
    public int[] towSum(int[] nums,int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        if(nums != null && nums.length>0){
            for (int i=0;i<nums.length;i++){
                //必须先判断map中是否存在和当前数组元素值相同的key，避免target和当前元素的差值等于当前元素，会返回类似[0,0]这样的错误结果
                if (hashMap.containsKey(nums[i])){
                    Integer index = hashMap.get(nums[i]);
                    int[] indexArr = {index,i};//考虑顺序的话 先存index再存当前元素的下标
                    return indexArr;
                }
                hashMap.put(target-nums[i],i);//target和当前元素的差值为key，下标为value，存入map
            }
        }
        return null;
    }
}
