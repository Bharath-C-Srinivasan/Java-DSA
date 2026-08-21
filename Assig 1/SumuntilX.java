// Sum Numbers Until the User Enters 'x'
/*
This program reads the input as a String so it can check for the character 'x'. If the input is a 
valid number, it parses it into an integer and adds it to the running total.
*/

import java.util.Scanner;

public class SumuntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter numbers to add (type 'x' to calculate total): ");
        
        while (true) {
            String val = sc.next();
            
            if (val.equalsIgnoreCase("x")) {
                break;
            }
            
            try {
                sum += Integer.parseInt(val);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'x'.");
            }
        }
        
        System.out.println("Total Sum: " + sum);
        sc.close();
    }
}