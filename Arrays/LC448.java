//448. Find All Numbers Disappeared in an Array
/*Given an array nums of n integers where nums[i] is in the range [1, n], 
return an array of all the integers in the range [1, n] that do not appear in nums. */

package Arrays;

import java.util.LinkedList;
import java.util.List;

public class LC448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int CurrNum = Math.abs(nums[i]);
            int idx = CurrNum - 1;

            if(nums[idx] < 0){
                continue;
            }
            nums[idx] = -1*nums[idx];
        }
        List <Integer> res = new LinkedList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                res.add(i + 1);
            }
        }
        return res;
    }
}
