package top100;

public class Demo11 {
    //做这个题目的时候一定要区分长和宽的取值  宽是数组里取得 长是下标相减
    //很重要的一点 只有更改较小边，才能扩大面积，注意指针移动的时机
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
