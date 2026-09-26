//119. Pascal's Triangle II
/*Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown: */

package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LC119 {
    public List<Integer> getRow(int rowIndex) {
        List <Integer> prev = new ArrayList<>();
        prev.add(1);

        for(int idx=1; idx<= rowIndex; idx++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);

            for(int i=1; i<=idx-1; i++){
                curr.add(prev.get(i) + prev.get(i-1));
            }
            curr.add(1);
            prev = curr;
        }
        return prev;
    }
}
