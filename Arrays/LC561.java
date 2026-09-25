//561. Array Partition
/*Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) 
such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum. */

package Arrays;

public class LC561 {
    public int arrayPairSum(int[] nums) {
        int k = 10000;
        int[] countarr = new int [2*k+1];

        for(int i=0; i<nums.length; i++){
            countarr[nums[i]+k]++;
        }

        boolean isEven = true;
        int maxsum = 0;

        for(int i=0; i<2*k+1; i++){
            while(countarr[i] > 0){
                maxsum = maxsum + (isEven ? (i-k) : 0);
                countarr[i]--;
                isEven = !isEven;
            }
        }
        return maxsum;
    }
}
