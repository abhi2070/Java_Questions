package KKPracticeSet.ConditionalLoop03;

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
