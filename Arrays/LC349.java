//349. Intersection of Two Arrays
/*Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must be unique and you may return the result in any order. */

package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer> S1 = new HashSet<>();
        Set <Integer> S2 = new HashSet<>();

        for(int num: nums1){
            S1.add(num);
        }
        for(int num: nums2){
            S2.add(num);
        }
        int[] res = new int[S1.size()];
        int k = 0;
        for(int num: S1){
            if(S2.contains(num)){
                res[k] = num;
                k = k + 1;
            }
        }
        return Arrays.copyOfRange(res,0,k);
    }
}
