class Solution {
    public void setZeroes(int[][] matrix) {
        int row = -1;
        int col = -1;
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if (matrix[i][j]==0){
                    row = i;
                    col = j;
                    List<Integer> arr1 = new ArrayList<>();
                    arr1.add(row); arr1.add(col);
                    arr.add(arr1);
                }
            }
        }
        for(List<Integer> arr2: arr){
            matrix[arr2.get(0)]= new int[matrix[0].length];
            for(int k = 0; k<matrix.length; k++){
                matrix[k][arr2.get(1)]=0;
            }
        }
    }
}