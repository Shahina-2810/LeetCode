class Solution {
    List<List<String>> result=new ArrayList<List<String>>();
    public List<List<String>> solveNQueens(int n) {
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = '.';
            }
        }
        backTrack(0, matrix, n);
        return result;
    }
    public void backTrack(int row,char[][] matrix,int n){
        if(row>=n){
            List<String> temp=new ArrayList<String>();
            for(int i=0;i<n;i++){
                StringBuilder str=new StringBuilder("");
                for(int j=0;j<n;j++){
                    str.append(matrix[i][j]);
                }
                temp.add(str.toString());
            }
            result.add(temp);
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