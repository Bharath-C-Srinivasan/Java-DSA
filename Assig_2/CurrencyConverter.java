//Convert Currency from Rupees to USD
/*
This program divides the INR amount by the exchange rate (I've used an approximate current rate 
of 84.0 for demonstration; you can adjust this variable).
*/

package Assig_2;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Approximate exchange rate (1 USD = 84.0 INR)
        double exchangeRate = 84.0; 
        
        System.out.print("Enter amount in Rupees (INR): ");
        double inr = input.nextDouble();
        
        double usd = inr / exchangeRate;
        
        System.out.println(inr + " INR is equal to " + String.format("%.2f", usd) + " USD.");
        
        input.close();
    }
}
