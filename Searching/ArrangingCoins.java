package KKPracticeSet.Searching;
//https://leetcode.com/problems/arranging-coins/description/
/**
 *You have n coins and you want to build a staircase with these coins. 
    The staircase consists of k rows where the ith row has exactly i coins. 
    The last row of the staircase may be incomplete.
Given the integer n, return the number of complete rows of the staircase you will build.
* 
* Input: n = 5
    Output: 2
    Explanation: Because the 3rd row is incomplete, we return 2.
 */
public class ArrangingCoins {
    public static void main(String[] args) {
        
    }
    public int arrangeCoins(int n) {
        int i=1;
        int count=0;
        while(n >= i){
                n=n-i;
                count++;
                i++;
                
        }
        return count;
    }
}
