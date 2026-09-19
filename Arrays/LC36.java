//36. Valid Sudoku
/*Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition. */

package Arrays;

public class LC36{
    public boolean isValidSudoku(char[][] board) {
       int[][] rows = new int[9][9];
       int[][] cols = new int[9][9];
       int[][] boxes = new int[9][9];

       for(int r=0; r<9; r=r+1){
           for(int c=0; c<9; c=c+1){
               if(board[r][c] == '.'){
                  continue;
               }
               int val = board[r][c] - '1';
               if(rows[r][val] == 1){
                  return false;
               }
               rows[r][val] = 1;
               if(cols[c][val] == 1){
                 return false;
               }
               cols[c][val] = 1;
               int boxIdx = 3*(r/3)+(c/3);
               if(boxes[boxIdx][val] == 1){
                 return false;
               }
               boxes[boxIdx][val] = 1;
           }
        }
        return true; 
    }
}