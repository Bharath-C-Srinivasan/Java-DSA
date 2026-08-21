//Find Armstrong Numbers Between Two Given Numbers
/*
An Armstrong number (like 153) is a number that is equal to the sum of its own digits each raised to 
the power of the number of digits 

(e.g., 1^3 + 5^3 + 3^3 = 153).
*/

package Assig_2;
import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter lower bound: ");
        int low = input.nextInt();
        
        System.out.print("Enter upper bound: ");
        int high = input.nextInt();
        
        System.out.println("Armstrong numbers between " + low + " and " + high + " are:");
        
        for (int num = low; num <= high; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }
        
        System.out.println();
        input.close();
    }
    
    // Helper method to check if a number is Armstrong
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        return sum == originalNum;
    }
}