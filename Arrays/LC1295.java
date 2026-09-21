//1295. Find Numbers with Even Number of Digits
/*Given an array nums of integers, return how many of them contain an even number of digits. */

package Arrays;

public class LC1295{
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            int digitCount = (int) Math.floor(Math.log10(num)) + 1;
            if(digitCount % 2 == 0 ){
                count++;
            }
        }
        return count;
    }
}