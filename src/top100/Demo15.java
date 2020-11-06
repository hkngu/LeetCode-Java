package top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo15 {
    static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length<3)
            return result;
        List<Integer> singleList = new ArrayList<>();
        int sum = 0;//三个数相加等于0就代表两个数相加等于另一个数的相反数
        int left;
        int right; //left和right指向的元素相加等于sum的相反数
        int len = nums.length;
        //为了避免重复查找，首先对数组进行排序
        Arrays.sort(nums);
        while (sum <= len -3 && nums[sum]<=0){//最小的那个数都大于0，加上后面的两个数，肯定不等于0
            left = sum+1;
            right = len -1;
            while (left < right){
                if (-nums[sum] == nums[left] + nums[right]){
                    singleList.add(nums[sum]);
                    singleList.add(nums[left]);
                    singleList.add(nums[right]);
                    result.add(singleList);
                    singleList = new ArrayList<>();
                    while (left < right && nums[left+1] == nums[left])//去重
                        left++;
                    while (left < right && nums[right-1] == nums[right])
                        right--;
                    left++;
                    right--;
                }else if (-nums[sum] > nums[left] + nums[right]){
                    while (left < right && nums[left+1] == nums[left])
                        left++;
                    left++;
                }else {
                    while (left < right && nums[right-1] == nums[right])
                        right--;
                    right--;
                }
            }
            while (sum <= len -3 && nums[sum+1] == nums[sum])//这里要带上sum <= len -3 的条件 否则像{0,0,0}这样的数组会数组越界
                sum++;
            sum++;
        }
        return  result;
    }

    public static void main(String[] args) {
        int[] arr  = {0,0,0};
        threeSum(arr);
        System.out.println(threeSum(arr).toString());
    }
}
