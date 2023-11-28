//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        float principal=sc.nextFloat();
        System.out.print("Enter time: ");
        float time=sc.nextFloat();
        System.out.print("Enter rate: ");
        float rate=sc.nextFloat();
        
        float SI=principal*(1+rate*time);
        System.out.println("Simple interest is: "+SI);
    }
}
