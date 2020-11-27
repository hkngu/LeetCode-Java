package algorithm;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr,int start,int end){
        if (arr == null || arr.length<=1)
            return ;
        if (end-start <=1)
            return;
        int left = start;
        int right = end;
        int temp = arr[start];
        while (left != right){
            while (arr[right] >= temp && left<right)//先移动右边很重要
                right--;
            while (arr[left] <= temp && left<right)
                left++;
            int num =  arr[left];
            arr[left] = arr[right];
            arr[right] = num;
        }
        //基准数和两游标指向的元素互换
        arr[start] = arr[left];
        arr[left] = temp;
        quickSort(arr,start,left);
        quickSort(arr,left+1,end);
    }

    public static void main(String[] args) {
        int[]  arr = {1,9,8,2,7,3,4,1,3};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
