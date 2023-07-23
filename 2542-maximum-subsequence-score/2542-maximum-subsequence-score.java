class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int [][] arr = new int[nums1.length][2];
        for(int i =0 ; i<nums1.length; i++){
            arr[i][0]=nums1[i];
            arr[i][1]=nums2[i];
        }
        Arrays.sort(arr, (x,y)->y[1]-x[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr[i][0];
            pq.add(arr[i][0]);
        }
        long res = sum * arr[k-1][1];
        for(int i = k; i<nums1.length; i++){
            sum += arr[i][0]-pq.poll();
            pq.add(arr[i][0]);
            res = Math.max(res, sum*arr[i][1]);
        }
        return res;
    }
}