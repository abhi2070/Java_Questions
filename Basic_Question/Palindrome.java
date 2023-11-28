//To find out whether the given number is Palindrome or not.

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
        //a==121;
        
        int result=0;
        while(a != 0){
            int rem=a%10;
            result =result*10+rem;
            a /= 10;
        }
        if (result == a) {
            System.out.println("it is a Palindrome number.");
        }else{
            System.out.println("it is not a Palindrome number.");
        }
            
    }
}
