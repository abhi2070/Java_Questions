//Take 2 numbers as input and print the largest number.

import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number: ");
        int a=sc.nextInt();
        System.out.print("Enter number: ");
        int b=sc.nextInt();
        
        if (a>b) {
            System.out.println("A is bigger.");
        }else{
            System.out.println("B is bigger.");
        }
    }
}
