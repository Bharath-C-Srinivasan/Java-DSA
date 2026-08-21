//Print a Greeting Message
/*
This program takes a string input (a name) and concatenates it with a greeting string.
*/

package Assig_2;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
        
        sc.close();
    }
}