package top100;

public class Demo21 {

    static ListNode mergeTowLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cursor = head;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                cursor.next = l2;
                cursor = cursor.next;
                l2 = l2.next;
            } else {
                cursor.next = l1;
                cursor = cursor.next;
                l1 = l1.next;
            }
        }
        if (l1 == null)
            cursor.next = l2;
        if (l2 == null)
            cursor.next = l1;
        return head.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node4.next = node5;
        ListNode node = mergeTowLists(node1, node4);
        while (node !=null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}
