// Find HCF and LCM of Two Numbers
/*
This solution uses the Euclidean algorithm to find the Highest Common Factor (HCF), and then 
calculates the Least Common Multiple (LCM) using the formula: 

LCM = (Number1 * Number2) / HCF
*/

package Assig_1;
import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        int originalA = a;
        int originalB = b;
        
        // Euclidean algorithm for HCF
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        int hcf = a;
        int lcm = (originalA * originalB) / hcf;
        
        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
        
        sc.close();
    }
}