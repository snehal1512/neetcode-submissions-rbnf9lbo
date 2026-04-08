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
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null) return true;

        ListNode slow = head, fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverse(slow);
        ListNode firstHalf = head;

        while(secondHalf!=null) {
            if(firstHalf.val!=secondHalf.val) {
                return false;
            }

            secondHalf = secondHalf.next;
            firstHalf = firstHalf.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;

        while(head!=null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }
}