/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head ==  null) return null;

        Node curr = head;
        while(curr!=null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        curr = head;
        while(curr!=null) {
            if(curr.random!=null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        Node old = head, newHead=head.next, copy=newHead;

        while(old!=null) {
            old.next = old.next.next;
            if(copy.next!=null) {
                copy.next = copy.next.next;
            }
            old = old.next;
            copy = copy.next;
        }
        return newHead;
    }
}
