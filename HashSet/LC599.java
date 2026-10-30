//599. Minimum Index Sum of Two Lists
/*Given two arrays of strings list1 and list2, find the common strings with the least index sum.

A common string is a string that appeared in both list1 and list2.

A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] 
then i + j should be the minimum value among all the other common strings.

Return all the common strings with the least index sum. Return the answer in any order. */

package HashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List <String> result = new ArrayList<>();
        Map <String, Integer> map = new HashMap<>();

        for(int i=0; i<list1.length; i++){
            map.put(list1[i], i);
        }
        int minIndex = Integer.MAX_VALUE;

        for(int i=0; i<list2.length; i++){
            if(map.containsKey(list2[i])){
                if(i + map.get(list2[i]) < minIndex){
                    minIndex = i + map.get(list2[i]);
                    result = new ArrayList<>();
                    result.add(list2[i]);
                }else if(i + map.get(list2[i]) == minIndex){
                    result.add(list2[i]);
                }
            }
        }

        String[] ans = new String[result.size()];
        for(int i=0; i<result.size(); i++){
            ans[i] = result.get(i);
        }

        return ans;
    }
}
