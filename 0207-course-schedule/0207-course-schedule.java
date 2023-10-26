class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        int[] inorder = new int[n];
        for(int i = 0; i<prerequisites.length; i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        for(int i = 0; i<prerequisites.length; i++){
            inorder[prerequisites[i][1]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        int res = 0;
        for(int i =0; i<n; i++){
            if(inorder[i]==0)queue.add(i);
        }
        while(!queue.isEmpty()){
            res++;
            int curr = queue.peek();
            queue.poll();
            for(int nbr: adj.get(curr)){
                inorder[nbr]--;
                if(inorder[nbr]==0) queue.add(nbr);
            }
        }
        if(res==n) return true;
        return false;
    }
}