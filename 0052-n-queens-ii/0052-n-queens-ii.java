class Solution {  int count=0;
    public int totalNQueens(int n) {
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = '.';
            }
        }
        backTrack(0, matrix, n);
        return count;
    }
    public void backTrack(int row,char[][] matrix,int n){
        if(row>=n){
            count++;
            return;
        }
        for(int col=0;col<n;col++){
            if(isValid(matrix,row,col,n)){
                matrix[row][col]='Q';
                backTrack(row+1,matrix,n);
                matrix[row][col]='.';
            }
            
        }
    }
    public boolean isValid(char[][] matrix,int row,int col,int n){
         for (int i = 0; i < row; i++) {
            if (matrix[i][col] == 'Q') return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (matrix[i][j] == 'Q') return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (matrix[i][j] == 'Q') return false;
        }
        return true;
    }
}