   public boolean isValidSudoku(char[][] board) {
        HashSet<String> sudoku = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char current_value = board[i][j];
                if(current_value != '.'){
                    if(!sudoku.add(current_value + " found in row " + i) ||
                      !sudoku.add(current_value + " found in column " + j) ||
                      !sudoku.add(current_value + "found in sub box " + i/3 + "-" + j/3)) return false;
                }
            }
        }
        return true;
    }