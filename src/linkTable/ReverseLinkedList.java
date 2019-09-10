package linkTable;

import java.util.List;

/**
 * leetcode 206 反转一个链表
 */
public class ReverseLinkedList {
    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
