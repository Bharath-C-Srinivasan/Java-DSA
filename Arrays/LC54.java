//54. Spiral Matrix
/*Given an m x n matrix, return all elements of the matrix in spiral order. */

package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LC54 {
public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        
        // Edge case: empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }

        int i = 0, j = -1;
        int m = matrix.length, n = matrix[0].length;
        int dir = 1;

        while (m > 0 && n > 0) {
            // Traverse horizontally across columns
            for (int k = 0; k < n; k++) {
                j += dir;
                res.add(matrix[i][j]); 
            }
            m -= 1;

            // Traverse vertically down/up rows
            for (int k = 0; k < m; k++) {
                i += dir;
                res.add(matrix[i][j]);
            }
            n -= 1;

            // Reverse direction (1 for right/down, -1 for left/up)
            dir = dir * -1;
        }

        return res;
    }
}
