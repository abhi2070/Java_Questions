package KKPracticeSet.FlowOfProgram01;
//Input a year and find whether it is a leap year or not.
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=sc.nextInt();
        
        if (year%400 == 0) {
            System.out.println("Yes it is a leap year!!");
        } else if (year%100 ==0){
            System.out.println("It's not a leap year!!");
        }else if(year%4 == 0){
            System.out.println("it is a leap year !!");
        }else{
            System.out.println("sorry but the netered year is not a leap year!!");
        }
        
        
        
    }
    
}
