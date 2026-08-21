//Check if a Number is Even or Odd
/*
This program takes an integer input from the user and checks its remainder when divided by 2.
*/

package Assig_2;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
        
        sc.close();
    }
}