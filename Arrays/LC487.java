//487: Max Consecutive Ones II
/*Given a binary array nums containing only 0s and 1s, return the maximum number 
of consecutive 1s in the array if you can flip at most one 0 to a 1. */

package Arrays;

public class LC487 {
    public int findmaxconsecutive(int [] nums){
        int i=0,
            j=0,
            max=0,
            zeroes=0;
        while(i<nums.length){
            if(nums[i] == 0){
                zeroes += 1;
            }
            while(zeroes == 2){
                if(nums[j] == 0){
                    zeroes -= 1;
                }
                j++;
            }
            max = Math.max(max, i-j+1);
            i++;
        }
        return max;
    }
}
