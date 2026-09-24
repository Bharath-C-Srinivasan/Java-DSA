//724. Find Pivot Index
/*Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the 
left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there 
are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1. */

package Arrays;

public class LC724 {
    public int pivotIndex(int[] nums) {
        int rightsum = 0;

        for(int i=0; i<nums.length; i++){
            rightsum += nums[i]; 
        }
        int leftsum = 0;
        
        for(int i=0; i<nums.length; i++){
            if(leftsum == rightsum - nums[i]){
                return i;
            }
            leftsum += nums[i];
            rightsum -= nums[i];
        }

        return -1;
    }
}
