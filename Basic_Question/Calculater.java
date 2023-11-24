package KKPracticeSet.FirstJava02;

import java.util.Scanner;
public class Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number: ");
        int a=sc.nextInt();
        System.out.print("Enter number: ");
        int b=sc.nextInt();
        System.out.print("Enter operator: ");
        char op=sc.next().charAt(0);
        
        if (op=='+') {
            System.out.println(a+b);
        }else if(op=='-') {
            System.out.println(a-b);
        }else if(op=='*') {
            System.out.println(a*b);
        }else if(op=='/' && b==0) {
            System.out.println(a/b);
        }else{
            System.out.println("Entered wrong operator.");
        }
    }
}
