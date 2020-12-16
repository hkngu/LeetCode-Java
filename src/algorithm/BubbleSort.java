package algorithm;

import java.util.Arrays;

public class BubbleSort {
    private static void bubbleSort(int[] arr){
        if (arr == null || arr.length <= 1)
            return ;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,1,46,7,8,2,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
