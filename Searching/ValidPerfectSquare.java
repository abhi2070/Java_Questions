package KKPracticeSet.Searching;
//https://leetcode.com/problems/valid-perfect-square/description/
/**
 *Given a positive integer num, return true if num is a perfect square or false otherwise.
 A perfect square is an integer that is the square of an integer. In other words,
 it is the product of some integer with itself.
 You must not use any built-in library function, such as sqrt.

Example 1:
    Input: num = 16
    Output: true
    Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
 */
public class ValidPerfectSquare {
    public static void main(String[] args) {
        
    }
    static boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int start=0;
        int end=num/2;

        while(start <= end){
            int mid=start+(end-start)/2;
            if(mid==num/mid && num%mid==0){
                return true;
            }else if(num/mid<mid){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
}
