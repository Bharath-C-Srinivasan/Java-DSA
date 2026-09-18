//283. Move Zeroes
/*Given an integer array nums, move all 0's to the end of it while 
maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array. */

package Arrays;

public class LC283 {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i =0; i<nums.length; i=i+1){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = 0;
                nums[j] = temp;
                j = j + 1;
            }
        }
    }

    public void moveZeroes1(int[] nums) {
        int n = nums.length;
        int [] ans = new int [n];
        int j = 0;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                ans[j++] = nums[i];
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                ans[j++] = nums[i];
            }
        }
        for(int i=0; i<n; i++){
            nums[i] = ans[i];
        }
    }
}
