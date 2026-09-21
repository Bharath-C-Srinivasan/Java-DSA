//977. Squares of a Sorted Array
/*Given an integer array nums sorted in non-decreasing order, 
return an array of the squares of each number sorted in non-decreasing order. */

package Arrays;

import java.util.Arrays;

public class LC977 {
    public int[] sortedSquares(int[] nums) {
        for(int i=0 ; i<=nums.length-1 ; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
