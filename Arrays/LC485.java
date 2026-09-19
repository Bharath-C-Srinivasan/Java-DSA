//485. Max Consecutive Ones
/*Given a binary array nums, return the maximum number of consecutive 1's in the array. */

package Arrays;

public class LC485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0,
            max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count += 1;
            }
            else{
                max = Math.max(max,count);
                count = 0;
            }
        }
        return Math.max(max,count);
    }
}
