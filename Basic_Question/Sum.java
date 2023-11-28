//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) 
//entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0 will act as exit.");
        int neg=0;
        int poseven=0;
        int posodd=0;
        while(true){
            System.out.print("Enter a number: ");
            int n=sc.nextInt();
            if(n==0){
                break;
            }else if (n<0) {
                neg+=n;
            }else if(n%2==0){
                poseven+=n;
            }else{
                posodd+=n;
            }
        }
        System.out.println("The sum of all negative number is: -"+neg);
        System.out.println("The sum of all positive even number is: "+poseven);
        System.out.println("The sum of all positive odd number is: "+posodd); 
    }
}
