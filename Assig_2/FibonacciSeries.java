//Calculate Fibonacci Series up to n numbers
/*
The Fibonacci series starts with 0 and 1, and the next number is always the sum of the previous two.
*/

package Assig_2;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of terms (n): ");
        int n = input.nextInt();
        
        int firstTerm = 0, secondTerm = 1;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        System.out.println();
        input.close();
    }
}