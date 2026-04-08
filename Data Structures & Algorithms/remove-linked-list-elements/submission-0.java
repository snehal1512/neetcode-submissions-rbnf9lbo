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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode current = head;
        ListNode prev = null;
        ListNode newHead = current;

        while(current!=null) {
            if(current.val == val) {
                if(prev!=null) {
                    prev.next = current.next;                    
                } else {
                    newHead = current.next;
                }    

            } else {
                prev = current;
            }            
            current = current.next;
        }
        return newHead;
    }
}