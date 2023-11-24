package KKPracticeSet.FirstJava02;

import java.util.Scanner;
public class Currencyconverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your amount in rupees: ");
        float rs=sc.nextFloat();
        
        float USD=rs*80.4f;
        System.out.println("Amount in USD: "+USD+"$");
    }
}
