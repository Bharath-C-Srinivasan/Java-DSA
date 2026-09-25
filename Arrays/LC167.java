//167. Two Sum II - Input Array Is Sorted
/*You are given a 1-indexed array of integers numbers that is already sorted in non-decreasing order.

Find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] 
and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers index1 and index2 as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space. */

package Arrays;

public class LC167 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length -1;
        for(int k=0; k<numbers.length; k++){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                return new int [] {i+1,j+1};
            }
            else if(sum > target){
                j--;
            }
            else{
                i++;
            }
        }
        return null;
    }
}
