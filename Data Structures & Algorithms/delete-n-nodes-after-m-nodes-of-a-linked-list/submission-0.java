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
    public ListNode deleteNodes(ListNode head, int m, int n) {

        ListNode current = head;

        while(current!=null) {
            int i = 1;
            int j = 0;

            while(i<m && current!=null){
                current = current.next;
                i++;
            }

            if(current==null) break;

            ListNode temp = current.next;

            while(j<n && temp!=null) {
                temp = temp.next;
                j++;
            }

            current.next = temp;
            current = temp;
        }

        return head;
    }
}
