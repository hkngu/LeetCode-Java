package top100;

public class Demo58 {
    public static int lengthOfLastWord(String s) {
        int result = 0;
        if (s == null || s.length()<1)
            return result;
        char[] array = s.toCharArray();
        //要去除末尾的空格 找到末尾不是空格的下标
        int temp = array.length-1;
        while(array[temp] == ' ' && temp>0){//测试用例中有"     "这种情况
            temp-- ;
        }
        for (int i=0;i<=temp;i++){//在下标为0到temp之间寻找即可
            if (array[i]==' '){//
                result = 0;
            }else {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a "));
    }
}
