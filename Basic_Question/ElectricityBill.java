package KKPracticeSet.ConditionalLoop03;

import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your current meter reading: ");
        int currreding=sc.nextInt();
        System.out.print("Enter last month meter reading: ");
        int oldreding=sc.nextInt();
        System.out.print("Enter how much state goverment charges for one 1unit: ");
        int perunit=sc.nextInt();
        
        int toatlreading=currreding-oldreding;
        int Amount=toatlreading*perunit;
        
        System.out.print("Electricity Bill is: "+Amount);
        
    }
    
}
