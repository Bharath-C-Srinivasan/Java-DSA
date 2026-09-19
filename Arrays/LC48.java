//48. Rotate Image
/*You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
DO NOT allocate another 2D matrix and do the rotation. */

package Arrays;

public class LC48 {
    public void rotate(int[][] matrix) {
        //transpose
        int n = matrix.length;
        for(int i=0; i<n; i=i+1){
            for(int j=i+1; j<n; j=j+1){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Row-wise transpose
        for(int i=0; i<n; i=i+1){
            for(int j=0; j<n/2; j=j+1){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}
