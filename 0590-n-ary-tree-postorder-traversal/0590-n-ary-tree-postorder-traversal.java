/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
    public void dfs(Node root, List<Integer> arr){
        if(root==null) return;
        
        
        for(Node nbr: root.children){
            dfs(nbr,arr);
        }
        arr.add(root.val);
    }
    
    public List<Integer> postorder(Node root) {
        List<Integer> arr = new ArrayList<>();
        dfs(root,arr);
        return arr;
    }
}