package KKPracticeSet.String;

public class Palindrome {
    public static void main(String[] args) {
        String str="aba";
        System.out.println(isPalindrome(str));
        
    }
    static boolean isPalindrome(String str){
        if (str==null || str.length()==0) {
            return true;
        }
        for (int i=0; i<str.length()/2; i++) {
            int startPoint=str.charAt(i);
            int endPoint= str.charAt(str.length()-1-i);
            
            if (startPoint != endPoint) {
                return false;
            }
        }
        return true;
    }
}
