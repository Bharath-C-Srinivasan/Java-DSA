//414. Third Maximum Number
/*You are given an integer array nums.

Return the third distinct maximum number in this array. 
If the third maximum does not exist, return the maximum number. */

package Arrays;

public class LC414 {
    public int thirdMax(int[] nums) {
        long max=Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;
        for(int num:nums){
            if(num>max){                
                tmax=smax;
                smax=max;
                max=num;
            }
            else if(num>smax && num!=max){
                tmax=smax;
                smax=num;
            }
            else if(num>tmax && num!=smax && num!=max){
                tmax=num;
            }
        }
        return tmax!=Long.MIN_VALUE ? (int)tmax : (int)max;
        
    }
}
