package top100;

public class Demo64 {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length<1){
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        //保存到达对应位置路径上的数字总和
        int[][] resultArray = new int[m][n];
        resultArray[0][0] = grid[0][0];
        //第一行
        for (int i=1;i<m;i++){
            resultArray[i][0] = resultArray[i-1][0]+grid[i][0];
        }
        //第一列
        for (int i=1;i<n;i++){
            resultArray[0][i] = resultArray[0][i-1]+grid[0][i];
        }
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                resultArray[i][j] = Math.min(resultArray[i-1][j],resultArray[i][j-1])+grid[i][j];
            }
        }
        return resultArray[m-1][n-1];
//        int result = 0;
//        if (grid == null || grid.length < 1)
//            return result;
//        result = grid[0][0];
//        int right = 0;
//        int down = 0;
//        while (down < grid[0].length && right < grid.length ) {
//            if (right+1>grid.length-1){
//                result+=grid[right][down+1];
//                down++;
//                continue;
//            }
//            if (down+1>grid[0].length-1){
//                result+=grid[right+1][down];
//                right++;
//                continue;
//            }
//            if (grid[right + 1][down] < grid[right][down + 1]) {
//                result += grid[right + 1][down];
//                right++;
//            } else {
//                result += grid[right][down + 1];
//                down++;
//            }
//        }
//        return result;
    }
}
