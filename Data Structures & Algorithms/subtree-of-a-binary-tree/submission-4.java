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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true;

        if(root == null || subRoot == null) return false;

        return hasSubtree(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right,subRoot);
    }

    private boolean hasSubtree(TreeNode a, TreeNode b){
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;
        if(a.val!=b.val) return false;

        return hasSubtree(a.left,b.left) && hasSubtree(a.right,b.right);
    }

}
