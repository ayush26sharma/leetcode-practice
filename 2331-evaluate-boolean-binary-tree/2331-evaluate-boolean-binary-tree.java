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
    
    public void dfs(TreeNode root, ArrayList<Integer> arr){
        if(root==null) return;
        dfs(root.left, arr);
        arr.add(root.val);
        dfs(root.right,arr);
    }
    
    public boolean evaluateTree(TreeNode root) {
        if(root.left==null && root.right==null){
            if(root.val==1) return true;
            else return false;
        }
        
        boolean left = evaluateTree(root.left);        
        boolean right = evaluateTree(root.right);
        
        if(root.val==3) return left && right;
        else return left || right;
        
    }
}