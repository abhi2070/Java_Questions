//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x=sc.nextInt();
        
        int a=0;
        int b=1;
        System.out.print(a);
        System.out.print(","+b);
        for (int i=1; i<=x; i++) {
            int c=a+b;
            a=b;
            b=c;
            System.out.print(","+c);
        }
        System.out.println("");
        System.out.println("Result after printing in proper formate: ");
        //Another way of printing 
        int m=0;
        int n=1;
        for (int i=1; i<=x; ++i) {
            System.out.print(m+" ");
            int c=m+n;
            m=n;
            n=c;
        }
        
    }
}
