//Check if a String is a Palindrome
/*
This program compares the original string to its reversed version. It converts the input to 
lowercase to ensure case-insensitivity.
*/

package Assig_2;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.next();
        
        // Convert to lowercase to ignore case sensitivity
        String original = str.toLowerCase();
        String reversed = "";
        
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        if (original.equals(reversed)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is not a Palindrome.");
        }
        
        sc.close();
    }
}