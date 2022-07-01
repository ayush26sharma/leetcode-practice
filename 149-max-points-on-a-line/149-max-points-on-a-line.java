class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        int result = 1;
        for(int i = 0; i <n-1; i++) {
            HashMap<Double, Set<int[]>> slope = new HashMap<>();
            for(int j = i+1; j<n; j++) {
                double y = (double)(points[j][1] - points[i][1]);
                double x = (double)(points[j][0] - points[i][0]);
                Double slope1 = y == 0.0 ? 0.0 : x == 0.0 ? Double.POSITIVE_INFINITY : y/x;
                Set<int[]> set = slope.getOrDefault(slope1, new HashSet<>());
                set.add(points[i]);
                set.add(points[j]);
                slope.put(slope1, set);
                result = Math.max(result, set.size());
            }
        }
        return result;
    }
}