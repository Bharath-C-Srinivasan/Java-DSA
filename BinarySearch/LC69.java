//69. Sqrt(x)
/*Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python. */

package BinarySearch;

public class LC69 {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        int left = 1, right = x;
        int result = 1;
        while(left <= right){
            int mid = left + (right-left)/2;
            long sqrd = (long) mid*mid;
            if(sqrd == x){
                return mid;
            }else if(sqrd < x){
                result = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return result;
    }
}
