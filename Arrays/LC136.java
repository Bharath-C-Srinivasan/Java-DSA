//136. Single Number
/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space. */

package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LC136 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            if(!map.containsKey(num)){
                map.put(num,0);
            }
            map.put(num,map.get(num)+1);
        }
        for(int num: nums){
            if(map.get(num) == 1){
                return num;
            }
        }
        return -1;
    }
}
