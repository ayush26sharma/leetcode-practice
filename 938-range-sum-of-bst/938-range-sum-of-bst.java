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
    int sum = 0;
    public void helper(TreeNode root, int x, ArrayList<Integer> arr){
        if(root==null) return;
        helper(root.left, x, arr);
        helper(root.right, x, arr);
        if(root.val<=x){
            sum+=root.val;
            arr.add(root.val);
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        helper(root, low, arr1);
        int a = sum; sum = 0;
        helper(root, high, arr2);
        System.out.println(arr1);
        System.out.println(arr2);
        return sum - a + low;
    }
}