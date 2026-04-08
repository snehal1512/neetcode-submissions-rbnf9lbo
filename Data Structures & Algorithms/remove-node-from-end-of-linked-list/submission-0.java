/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int m = 0;

        while(curr!=null) {
            curr = curr.next;
            m++;
        }

        if (n==m) return head.next;

        curr = head;
        for(int i=1;i< m-n ;i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}
