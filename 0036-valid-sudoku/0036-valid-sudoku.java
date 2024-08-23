class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    // Check the row
                    if (!seen.add(num + " in row " + i)) return false;
                    // Check the column
                    if (!seen.add(num + " in col " + j)) return false;
                    // Check the 3x3 sub-box
                    if (!seen.add(num + " in box " + i / 3 + "-" + j / 3)) return false;
                }
            }
        }
        return true;
    }
}