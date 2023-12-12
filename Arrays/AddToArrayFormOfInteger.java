package KKPracticeSet.Arrays;
//https://leetcode.com/problems/add-to-array-form-of-integer/description/
import java.util.ArrayList;
import java.util.List;

/**
 *The array-form of an integer num is an array representing its digits in left to right order.

    For example, for num = 1321, the array form is [1,3,2,1].
    Given num, the array-form of an integer, and an integer k, return the array-form 
    of the integer num + k.

Example 1:

    Input: num = [1,2,0,0], k = 34
    Output: [1,2,3,4]
    Explanation: 1200 + 34 = 1234
 */
public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        
    }
     public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans=new ArrayList<>();

        int numsSum=0;
        for(int i=0; i<num.length; i++){
            numsSum=numsSum*10+num[i];
        }
        int ansSum=numsSum+k;
        int reverseAnsSum=0;
        while(ansSum > 0){
            int rem=ansSum%10;
            reverseAnsSum = reverseAnsSum*10+rem; 
            ansSum /= 10;
        }

        while(reverseAnsSum > 0){
            int rem=reverseAnsSum%10;
            ans.add(rem);
            reverseAnsSum /= 10;
        }

        return ans;
    }
}
