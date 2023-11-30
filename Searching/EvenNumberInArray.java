package KKPracticeSet.Searching;
//You have given a set of numbers. you have to find how many numbers are even in it by their digits.
public class EvenNumberInArray {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,78,96};
        
        System.out.println(findNumber(arr));
    }
    static int findNumber(int[] arr){
        if (arr.length==0) {
            return -1;
        }
        int count=0;
        for (int i=0; i<arr.length; i++) {
            boolean even=even(arr[i]);
            if (even==true) {
                count++;
            }
        }
        return count;
    }
    
    static boolean even(int num){
        int digit=numberOfDigits(num);
        if (digit%2==0) {
            return true;
        }
        return false;
    }
    
    static int numberOfDigits(int num){
        int count=0;
        while(num != 0){
            num /=10;
            count++;
        }
        return count;
    }
}
