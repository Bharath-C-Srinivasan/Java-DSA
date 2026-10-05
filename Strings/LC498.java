//498. Diagonal Traverse
/*Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order. */

package Strings;

public class LC498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int rowIdx = 0, colIdx = 0;
        int k = 0, dir = 1;
        int [] res = new int [m*n];

        while(k < m*n){
            res[k] = mat[rowIdx][colIdx];
            k++;
            int newrowIdx = dir == 1 ? rowIdx - 1 : rowIdx + 1;
            int newcolIdx = dir == 1 ? colIdx + 1 : colIdx - 1;
            if(newrowIdx < 0 || newcolIdx < 0 || newrowIdx > (m-1) || newcolIdx > (n-1)){
                if(dir == 1){
                    if(colIdx == n-1){
                        rowIdx += 1;
                    }else{
                        colIdx += 1;
                    }
                }else{
                    if(rowIdx == m-1){
                        colIdx += 1;
                    }else{
                        rowIdx += 1;
                    }
                }
                dir = -1*dir;
            }else{
                rowIdx = newrowIdx;
                colIdx = newcolIdx;
            }
        }
        return res;
    }
}
