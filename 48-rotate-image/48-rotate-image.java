class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                if(matrix[i][j]>0){
                    int temp = matrix[i][j]-2000;
                    matrix[i][j]=matrix[j][i]-2000;
                    matrix[j][i]=temp;
                }
            }
        }
        
        for(int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                if(matrix[i][j]<0) matrix[i][j]+=2000;
            }
        }
        
        for (int i = 0; i<row; i++){
            for (int j = 0; j<col/2; j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[i][col-j-1];
                matrix[i][col-j-1]=temp;
            }
        }
    }
}