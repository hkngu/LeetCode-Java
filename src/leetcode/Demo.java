package leetcode;

import java.util.ArrayList;

public class Demo {
    public static final char[] array = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    static String Int2String(int number){
        char[] array = null;
        int length =0;
        char fillchar = '0';
        if (array == null){
            array = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
            length = array.length;
        }
        StringBuilder result  =new StringBuilder();
        while (number>0){
            result.insert(0,array[number % length]);
            number /= length;
        }
        while (result.length()<4){
            result.append(fillchar);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        //System.out.println(Int2String(51));
        for (int i=0;i<1000000;i++){
            if (String2Int(Int2String(i)) != i)
                System.out.println("...");
        }
        //System.out.println(String2Int("Z000"));
        toStr();
    }

    static int String2Int(String s){
        int sum = 0;
        int temp =0;
        char[] sArr = s.toCharArray();
        //删掉字符 '0'
        ArrayList<Character> arr = new ArrayList<>();
        for (int i=0;i<sArr.length;i++){
            if (sArr[i] != '0'){
                arr.add(sArr[i]);
            }
        }
        for (int i = arr.size()-1;i>=0;i--){
            for (int j=0 ;j<array.length;j++){
                if (arr.get(i) == array[j]){
                    sum += j*Math.pow(52,temp);
                }

            }
            temp++;
        }

        return sum;

    }


    static void toStr(){
        ArrayList<String> al = new ArrayList<>();
        boolean temp = false;
        for (int i=100;i<10000;i++){
            al.add(Int2String(i));
        }
        ArrayList<String> tempList = new ArrayList<>();
        //移除其中包含字符b或者c的元素
        for (String s : al){
            if (!s.contains("b") && !s.contains("c")){
                tempList.add(s);
            }
        }
        al = new ArrayList<>();
        //"0"替换成"*"
        for (String s : tempList){
            if (s.contains("0")){
                s = s.replaceAll("0","*");
            }
            al.add(s);
        }
        //包含D的拼接成字符串
        StringBuffer endStr  = new StringBuffer();
        for(String s : al){
            if (s.contains("d")){
                endStr.append(s);
            }
        }
        //把endStr中的"D*"替换成R
        String result = endStr.toString().replaceAll("D*","R");
        System.out.println(result);
    }

}
