package leetcode;

public class Demo19 {
    static ListNode removeNthFromEnd(ListNode head,int n){
        ListNode fast = head;
        ListNode slow = head;

        //第一个指针后移n位 题目中说保证给的n有效，不用判断是否n大于链表长度 如果没有说明可以在n大于链表长度的时候直接返回头节点
        while (n-->0){
            fast = fast.next;
        }
        //删除的是头节点
        if (fast == null){
            return head.next;
        }

        //把slow移到倒数第n个节点的前一个节点
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    public static void main(String[] args) {
        ListNode node1  = new ListNode(1);
        ListNode node2  = new ListNode(2);
        ListNode node3  = new ListNode(3);
        node1.next = node2;
        node2.next =node3;


        ListNode node = removeNthFromEnd(node1, 3);
        while (node !=null){
            System.out.println(node.val);
            node = node.next;
        }

    }
}
