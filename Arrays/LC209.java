//209. Minimum Size Subarray Sum
/*Given an array of positive integers nums and a positive integer target, 
return the minimal length of a subarray whose sum is greater than or equal to target. 
If there is no such subarray, return 0 instead. */

package Arrays;

public class LC209 {
    public int minSubArrayLen(int target, int[] nums) {
        int minDis  = Integer.MAX_VALUE;
        int left = 0,
            right = 0;
        int runsum = 0;

        while(right < nums.length){
            runsum += nums[right];
            while(runsum >= target){
                minDis = Math.min(minDis, right - left + 1);
                runsum -= nums[left];
                left++;
            }
            right++;
        }
        return minDis == Integer.MAX_VALUE ? 0 : minDis;
    }
}
