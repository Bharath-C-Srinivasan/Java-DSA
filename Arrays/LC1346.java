//1346. Check If N and Its Double Exist
/*Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j] */

package Arrays;

import java.util.HashSet;
import java.util.Set;

public class LC1346 {
    public boolean checkIfExist(int[] arr) {
        Set <Integer> set = new HashSet<>();
        for(int num: arr){
            if(set.contains(2*num) || (set.contains(num/2) && (num % 2 == 0))){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
