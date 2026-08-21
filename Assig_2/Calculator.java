//Basic Calculator using if Conditions
/*
This reads an operator character and two numbers, then performs the corresponding arithmetic operation.
*/

package Assig_2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        
        double result = 0;
        boolean validOperation = true;
        
        if (operator == '+') {
            result = num1 + num2;
        } 
        else if (operator == '-') {
            result = num1 - num2;
        } 
        else if (operator == '*') {
            result = num1 * num2;
        } 
        else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Cannot divide by zero.");
                validOperation = false;
            }
        } 
        else {
            System.out.println("Invalid operator.");
            validOperation = false;
        }
        
        if (validOperation) {
            System.out.println("Result: " + result);
        }
        
        sc.close();
    }
}