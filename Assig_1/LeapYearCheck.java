// Check for a Leap Year 
/*
A year is a leap year if it is divisible by 4. However, century years (like 1900 or 2000) must be 
divisible by 400 to be considered a leap year.
*/

package Assig_1;
import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        sc.close();
    }
}
