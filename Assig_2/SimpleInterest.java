//Calculate Simple Interest
/*
The formula for Simple Interest is (Principal * Time * Rate) / 100. We use double for precision
*/

package Assig_2;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Principal amount: ");
        double principal = input.nextDouble();
        
        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();
        
        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();
        
        double simpleInterest = (principal * time * rate) / 100;
        System.out.println("The Simple Interest is: " + simpleInterest);
        
        input.close();
    }
}
