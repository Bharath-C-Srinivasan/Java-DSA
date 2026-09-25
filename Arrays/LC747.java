//747. Largest Number At Least Twice of Others
/*You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as 
every other number in the array. If it is, return the index of the largest element, or return -1 otherwise. */

package Arrays;

public class LC747 {
    public int dominantIndex(int[] nums) {
        int idx  = -1,
            max1 = -1,
            max2 = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max1){
                max2 = max1;
                max1 = nums[i];
                idx = i;
            }else if(nums[i] > max2){
                max2 = nums[i];
            }
        }
        return max1 >= (2*max2) ? idx: -1;
    }
}
