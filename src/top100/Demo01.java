package top100;

import java.util.HashMap;

/**
 * 遍历数组，以target和当前元素的差值为key 下标为value插入hashmap
 * 每遍历到一个元素，先判断有无存在的key map.containsKey()
 * 如果有 则取该key的value及当前遍历到的下标，返回
 */
public class Demo01 {
    public int[] towSum(int[] nums,int target){
        if (nums == null || nums.length<2)
            return null;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                Integer index = map.get(nums[i]);
                return new int[]{index,i};
            }
            map.put(target-nums[i],i);
        }
        return null;
    }
}
