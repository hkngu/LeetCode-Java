package top100;

import java.util.ArrayList;

public class Demo03 {
    static int lengthOfLongestSubstring(String s){
        int left = 0;//k
        int right = 1;//i
        int temp = 0;//j
        int length = 0;

//        int mLeft = 0;
//        int mRight =1;
        if (s.length() < 2){
            return s.length();
        }
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
           arrayList.add(s.charAt(i));
        }
        while (right<arrayList.size()){
            temp = left;
            while (temp<right){
                if (arrayList.get(temp) == arrayList.get(right)){
//                    if (right - left  > length){
//                        mLeft =left;
//                        mRight = right;
//                    }
                    length = Math.max(length,right- left);//这里的right其实指向的是那个重复的元素，所以这里的字串长度为right-1
                    left = temp +1;
                    break;
                }else {
                    temp++;
                }
            }
//            if (right - left +1 > length){
//                mLeft =left;
//                mRight = right;
//            }
            length = Math.max(right-left+1,length);
            right++;
        }
        return length;
//        if (s.length() ==1)
//            return 1;
//        ArrayList<Character> arrayList = new ArrayList<>();
//        int maxLength = 0;
//        int left = 0;
//        int right = 1;
//        int tempLength = 0;
//        for (int i = 0; i < s.length(); i++) {
//            arrayList.add(s.charAt(i));
//        }//tmmzuxt
//        HashMap<Character,Integer> map = new HashMap<>();
//        map.put(arrayList.get(left),left);
//        while (right<arrayList.size() ){
//            Character c = arrayList.get(right);
//            if (map.containsKey(c)){
//                left = map.get(c);
//                tempLength = right -left ;
//                maxLength = Math.max(tempLength,maxLength);
//
//            }else{
//                tempLength = right - left;
//                maxLength = Math.max(tempLength,maxLength);
//            }
//            map.put(c,right);
//            right++;
//        }
//
//        return maxLength;
    }

    public static void main(String[] args) {
        int i = lengthOfLongestSubstring("tnmcammcv");
        //System.out.println(i);
    }
}
