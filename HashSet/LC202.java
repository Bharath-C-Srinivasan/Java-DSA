//202. Happy Number
/*Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not. */

package HashSet;

import java.util.HashSet;
import java.util.Set;

public class LC202 {
    public int SumSquare(int n){
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            n = n / 10;
            sum = sum + (digit*digit);
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set <Integer> set = new HashSet<>();
        while(n != 1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            n = SumSquare(n);
        }
        return true;
    }

    public boolean isHappyOptimized(int n) {
        int slow = n,
            fast = n;
        
        while(true){
            slow = SumSquare(slow);
            fast = SumSquare(SumSquare(fast));

            if(fast == 1){
                return true;
            }
            
            if(slow == fast){
                return false;
            }
        }
    }
}
