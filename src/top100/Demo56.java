package top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo56 {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length < 2){
            return intervals;
        }
        List<int[]> list = new ArrayList<>();
        //对二维数组进行排序，按每一行的左边界升序排序 return o2[0]-o1[0]为按照第一个元素降序排序
        Arrays.sort(intervals,((o1, o2) -> {
            return o1[0]-o2[0];
        }));
        int i = 0;
        while (i<intervals.length){
            int left = intervals[i][0];
            int right = intervals[i][1];
            //下一个数组的左边界比当前数组的右边界还要小或者是相等(相等必须带上) 说明两个数组代表的区域有重合的地方
            while (i<intervals.length-1 && intervals[i+1][0] <= right){
                right = Math.max(right,intervals[i+1][1]);
                i++;
            }
            list.add(new int[]{left,right});
            i++;
        }
        return list.toArray(new int[list.size()][2]);
    }


}
