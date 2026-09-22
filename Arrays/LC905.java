//905. Sort Array By Parity
/*Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition. */

package Arrays;

public class LC905 {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0,
            j = nums.length - 1;

        while(i < j){
            int mod1 = nums[i] % 2,
                mod2 = nums[j] % 2;

            if(mod1 == 1 && mod2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(mod1 == 0){
                i++;
            }
            if(mod2 == 1){
                j--;
            }
        }
        return nums;
    }
}
