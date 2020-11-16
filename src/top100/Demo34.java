package top100;

import java.util.Arrays;

public class Demo34 {
    static int[] searchRange(int[] nums,int target){
        //经典二分法 要注意边界值
        int[] result = {-1,-1};
        if (nums == null || nums.length<1)
            return result;
        int left = 0;
        int right = nums.length-1;
        while (left<=right){ //这里的条件必须是left<=right  不然当target等于数组的边界值的时候，会返回[-1,-1]
            int mid = (right+left)/2;
            if (nums[mid] == target){
                int leftTemp = mid;
                while (leftTemp>=left && nums[leftTemp] == target){
                    leftTemp--;
                }
                int rightTemp = mid;
                while (rightTemp<=right && nums[rightTemp] == target){
                    rightTemp++;
                }
                result = new int[]{leftTemp + 1, rightTemp - 1};
                break;
            }else if (nums[mid]>target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,5,6};
        int[] arr = searchRange(nums, 6);
        System.out.println(Arrays.toString(arr));
    }
}
