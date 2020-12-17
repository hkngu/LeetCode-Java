package algorithm;

import java.util.Arrays;

public class InsertSort {
    private static void insertSort(int[] arr){
        //插入排序 就是把整个数组分为两部分，左边为有序部分，右边认为是无序部分，每次将右边最左边的元素放入左边的部分
        //通过和左边元素的比较，插入到正常的位置
        if (arr == null || arr.length<=1)
            return;
        for (int i=1;i<arr.length;i++){
            if (arr[i]<arr[i-1]){
                int temp = arr[i];
                int j;
                for(j=i-1;j>=0 && temp<arr[j];j--){
                    //把前一个数字赋给后一个数字
                    arr[j+1] = arr[j];
                }
                arr[j+1] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {8,6,4,1};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
