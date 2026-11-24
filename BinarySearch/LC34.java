//34. Find First and Last Position of Element in Sorted Array
/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity. */

package BinarySearch;

public class LC34 {
    public int findfirstpos(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int firstidx = -1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                firstidx = mid;
                right = mid - 1;
            }else if (target > nums[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return firstidx;
    }

    public int findlastpos(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int lastidx = -1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                lastidx = mid;
                left = mid + 1;
            }else if (target > nums[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return lastidx;
    }

    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return new int[] {-1, -1};
        }
        int first = findfirstpos(nums, target);
        if(first == -1){
            return new int[]{-1, -1};
        }
        int last = findlastpos(nums, target);
        return new int[] {first, last};
    }
}
