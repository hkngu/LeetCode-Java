package top100;

public class Demo72 {
    public int minDistance(String word1, String word2) {
        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();
        int m = array1.length;
        int n = array2.length;
        //代表第一个单词的前m个字符转为第二个字符串前n个字符需要的次数 长度要+1
        int[][] resultArray = new int[m+1][n+1];
        //二维数组的第一排和第一列可以确定
        for (int i=0;i<=m;i++){
            resultArray[i][0] = i;
        }
        for (int i=0;i<=n;i++){
            resultArray[0][i] = i;
        }
        for (int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){//这里条件都是小于或等于
                if (array1[i-1] == array2[j-1]){//注意这里比较的是当前遍历到的元素下标为i-1和j-1
                    resultArray[i][j] = resultArray[i-1][j-1];
                }else {
                    resultArray[i][j] = Math.min(resultArray[i][j-1],Math.min(resultArray[i-1][j],resultArray[i-1][j-1]))+1;
                }
            }
        }
        return resultArray[m][n];
    }
}
