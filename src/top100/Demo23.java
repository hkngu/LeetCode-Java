package top100;

import java.util.List;

public class Demo23 {
    public ListNode mergeKLists(ListNode[] lists){
        //参考Demo21 两个链表的合并 分治法
        if (lists == null || lists.length == 0)
            return null;
        if (lists.length == 1)
            return lists[0];
        if (lists.length == 2)
            return mergeTowLists(lists[0],lists[1]);

        int mid = lists.length/2;//取中间的节点 分治
        ListNode[] leftLists = new ListNode[mid];
        for (int i=0;i<mid;i++){
            leftLists[i] = lists[i];
        }
        ListNode[] rightLists = new ListNode[lists.length - mid];
        for (int i=0;i<rightLists.length;i++){
            rightLists[i] = lists[i+mid];
        }
        ListNode leftNode = mergeKLists(leftLists);
        ListNode rightNode = mergeKLists(rightLists);
        return mergeTowLists(leftNode,rightNode);
    }

    //这里用递归实现一下两个链表的合并
    private ListNode mergeTowLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode node = null;
        if (l1.val >= l2.val){
            node = l2;
            node.next = mergeTowLists(l1, l2.next);
        }else {
            node = l1;
            node.next = mergeTowLists(l1.next,l2);
        }
        return node;
    }

}
