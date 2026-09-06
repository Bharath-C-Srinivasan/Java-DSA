// Print the Sum of Two Numbers
/* This program uses a Scanner to read two integers and outputs their sum. */

package Assig_1;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        
        sc.close();
    }
}
