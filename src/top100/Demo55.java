package top100;

public class Demo55 {
    public boolean canJump(int[] nums){
        //如果数组中没有0，则可以到达尾部，如果有0，则要判断是否可以跳过
        if (nums.length<=1)
            return true;
        for (int i=0;i<nums.length;i++){
            if (nums[i] == 0 && i != nums.length-1){ //这里一定要判断是不是最后一个元素，最后一个元素为0，就不用判断了
                boolean temp = false;
                for (int j=i;j>=0;j--){
                    if (i-j<nums[j]){
                        temp = true;
                        break;
                    }
                }
                if (!temp){
                    return false;
                }
            }
        }
        return true;
    }
}
