//Perfect Number In Java

import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        
        int b=0;
        for (int i=1; i!=a; i++) {
                if (a%i==0) {
                    b+=i;
            }
        }
        if (b==a) {
            System.out.println("It is a perfect number.");
        }else{
            System.out.println("It is not perfect numbker.");
        }
       
    }
    
}
