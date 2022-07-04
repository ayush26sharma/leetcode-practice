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
    
    
   public boolean tree(TreeNode leftRoot, TreeNode rightRoot){
     if(leftRoot==null && rightRoot==null)return true;
     if(leftRoot==null || rightRoot==null)return false;
     
     boolean left = tree(leftRoot.left, rightRoot.right);
     boolean right = tree(leftRoot.right, rightRoot.left);
     
     return (leftRoot.val==rightRoot.val && left && right);
   }
    public boolean isSymmetric(TreeNode root) {
         return tree(root.left,root.right);
    }
}