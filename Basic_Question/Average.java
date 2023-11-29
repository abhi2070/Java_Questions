//Calculate Average Of N Numbers

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Calculate Average Of N Numbers
        System.out.println("0 will act as exit.");
        int x=0;
        int num=0;
        while(true){
            System.out.print("Enter a number: ");
            int n=sc.nextInt();
            if (n==0) {
                break;
            }else{
                x += n;
                num++;
            }
        }
        int avg=x/num;
        System.out.println("The avg of "+num+" is: "+avg);
    }
}
