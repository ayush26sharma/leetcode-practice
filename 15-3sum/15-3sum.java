class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<List<Integer>> ();
        for(int i = 0; i<nums.length; i++){
            int p = i+1; int q = nums.length-1;
            while(p<q){
                if (nums[i]+nums[p]+nums[q]==0){
                    ArrayList<Integer> res1 = new ArrayList<>();
                    res1.add(nums[i]);
                    res1.add(nums[p]);
                    res1.add(nums[q]);
                    set.add(res1);
                    p++;q--;
                    // System.out.println(nums[i]+" "+nums[p]+" "+nums[q]);
                }
                else if (nums[i]+nums[p]+nums[q]<0){
                    p++;
                }
                else{
                    q--;
                } 
            }
        }
        // System.out.println(set);
        ArrayList<List<Integer>> res2 = new ArrayList<>();
        for (List<Integer> x : set){
            res2.add(x);
        }
        return res2;
    }
}