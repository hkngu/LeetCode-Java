package top100;

public class Demo53 {
    public int maxSubArray(int[] nums){
        if (nums == null|| nums.length<1)
            return 0;
        int result = nums[0];//初始的result为第一个元素 防止数组内全是负数
        int sum = 0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            result = Math.max(result, sum);
            if (sum<0)
                sum = 0;
        }
        return result;
    }
}
