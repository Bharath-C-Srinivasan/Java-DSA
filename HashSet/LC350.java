//350. Intersection of Two Arrays II
/*Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must appear as many times as it shows in both arrays 
and you may return the result in any order. */

package HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int res [] = new int [nums1.length];
        int k = 0;
        int i =0,j = 0;

        while (i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                res[k] = nums1[i];
                k = k+1;
                i = i+1;
                j = j+1;
            }else if(nums1[i] > nums2[j]){
                j = j+1;
            }
            else{
                i = i+1;
            }
        }
        return Arrays.copyOfRange(res,0,k);
    }

    public int[] intersectOptimized(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }
        List <Integer> result = new ArrayList<>();
        Map <Integer, Integer> counts = new HashMap<>();

        for(int num: nums1){
            counts.put(num,counts.getOrDefault(num,0) + 1);
        }

        for(int num : nums2){
            if(counts.containsKey(num) && counts.get(num) > 0){
                counts.put(num,counts.get(num)-1);
                result.add(num);
            }
        }

        int[] ans = new int [result.size()];
        for(int i=0; i<result.size(); i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}