package KKPracticeSet.ConditionalLoop03;

import java.util.Scanner;
public class WithFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of month: ");
        int mon=sc.nextInt();
        int days=0;
        switch(mon){
            case 1 : days=31;
                     break;
            case 2 : days=28;
                     break;         
            case 3 : days=31;
                     break;
            case 4 : days=30;
                     break;
            case 5 : days=31;
                     break;
            case 6 : days=30;
                     break;
            case 7 : days=31;
                     break;
            case 8 : days=30;
                     break;         
            case 9 : days=31;
                     break;
            case 10 : days=30;
                     break;
            case 11 : days=31;
                     break;
            case 12 : days=30;
                     break;
            default : System.out.println("Enter wrong month.");
        }
        int count=0;
        for (int i=1; i<=days; i++) {
            if (i%2==0) {
                count++;
            }
        }
        System.out.println("kunal can go out on "+count+" days.");
    }
}
