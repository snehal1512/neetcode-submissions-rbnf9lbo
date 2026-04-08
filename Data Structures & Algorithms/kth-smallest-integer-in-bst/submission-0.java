/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public int kthSmallest(TreeNode root, int k) {
        
        inorder(root);

        for(int i=1;i<k;i++) {
            pq.poll();
        }

        return pq.poll();

    }

    private void inorder(TreeNode node) {
        if(node==null) return;
        inorder(node.left);
        pq.add(node.val);
        inorder(node.right);
    }
}
