package leetcode;

public class Demo02 {
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode root = new ListNode(0);
        ListNode temp = root;
        int addNum = 0; //进位
        int num1 = 0;
        int num2 = 0;
        while (l1 != null || l2 != null || addNum != 0){
            num1 = l1 == null ? 0 : l1.value;
            num2 = l2 == null ? 0 : l2.value;
            int sum = num1 + num2 + addNum;
            int sumNum = sum%10;
            ListNode listNode = new ListNode(sumNum);
            temp.next = listNode;
            temp = temp.next;
            addNum = sum/10;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return root.next;
    }

    static class ListNode{
        int value;
        ListNode next ;

        public ListNode(int value) {
            this.value = value;
        }
    }

}
