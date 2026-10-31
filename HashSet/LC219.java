//219. Contains Duplicate II
/*Given an integer array nums and an integer k, return true if there are two distinct 
indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k. */

package HashSet;

import java.util.HashMap;
import java.util.Map;

public class LC219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int diff = i - map.get(nums[i]);
                if(diff <= k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
