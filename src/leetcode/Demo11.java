package leetcode;

public class Demo11 {
    public int maxArea(int[] height){
        if (height.length<2)
            return 0;
        int left=0;
        int right=height.length-1;
        int minLen=0;
        int area = 0;
        while (left < right){
            minLen = Math.min(height[left],height[right]);
            area = Math.max((right-left)*minLen,area);
            if (minLen == height[left]){
                left ++;
            }else {
                right--;
            }
        }
        return area;
    }
}
