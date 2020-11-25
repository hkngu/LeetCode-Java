package top100;

public class Demo48 {
    public void rotate(int[][] matrix) {
        int p = 0;
        int len = matrix[0].length-1;
        int add ; //每一层移动完了之后，要归零
        int temp = 0;//临时存储一个元素
        //四个点的坐标(p+add,p) (len,p+add) (len-add,len) (p,len-add)
        while (p <len){
            add = 0;
            while (add< len- p){
                temp = matrix[p+add][p];
                matrix[p+add][p] = matrix[len][p+add];
                matrix[len][p+add] = matrix[len-add][len];
                matrix[len-add][len] = matrix[p][len-add];
                matrix[p][len-add] = temp;
                add++;
            }
            len--;
            p++;
        }
    }
}
