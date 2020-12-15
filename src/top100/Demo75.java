package top100;

public class Demo75 {
    public void sortColors(int[] nums) {
        //这个题目还需要考虑 这里先手写一下快排
        quickSort(nums,0,nums.length-1);
    }
    private static void quickSort(int[] arr,int start,int end){
        if (arr == null || arr.length<=1)
            return;
        if (end-start <= 1)
            return;
        int left = start;
        int right = end;
        int temp = arr[start]; //以这个数为标准数
        while (left < right){
            //先移动右边的游标，如果比标准数大或者等于标准数，右边左移，左边的游标同理
            //当right指向的元素小于标准数 将left指向的元素赋值为right指向的元素
            while (temp<=arr[right] && left<right)
                right--;
            if (left<right)
                //先用右边的元素覆盖左边的元素，再left+1
                arr[left++] = arr[right];
            while (temp>=arr[left] && left<right)
                left++;
            if(left<right)
                arr[right--] = arr[left];
        }
        arr[left] = temp;
        quickSort(arr,start,left-1);
        quickSort(arr,left+1,end);
    }
}
