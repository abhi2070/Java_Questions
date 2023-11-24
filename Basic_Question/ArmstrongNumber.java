package KKPracticeSet.FirstJava02;

import java.lang.Math;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        for (int i=a+1; i<b; i++) {
            int digit=0;
            int result=0;
            int orignalnum=i;
            //will count number of digit in a number.
            while(orignalnum != 0){
                orignalnum /= 10;
                digit++;
            }
            orignalnum=i;
            //loop to find armstrong number 
            while(orignalnum != 0){
                int rem=orignalnum%10;
                result += Math.pow(rem, digit);
                orignalnum /= 10;
            }
            if (result == i) {
                System.out.print(i+" ");
            }
        }
    }
}
