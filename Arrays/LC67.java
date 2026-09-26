//67. Add Binary
/*Given two binary strings a and b, return their sum as a binary string. */

package Arrays;

import java.math.BigInteger;

public class LC67 {
    public String addBinary(String a, String b) {
        BigInteger one = new BigInteger(a,2);
        BigInteger two = new BigInteger(b,2);
        BigInteger zero = new BigInteger("0",2);
        BigInteger result, carry;

        while(two.compareTo(zero) != 0){
            result = one.xor(two);
            carry = one.and(two).shiftLeft(1);
            one = result;
            two = carry;
        }
        return one.toString(2);
    }
}
