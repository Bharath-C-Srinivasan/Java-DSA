//217. Contains Duplicate
/*Given an integer array nums, return true if any value appears at least 
twice in the array, and return false if every element is distinct. */

package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    } 
}
