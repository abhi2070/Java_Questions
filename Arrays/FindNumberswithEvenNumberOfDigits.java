package KKPracticeSet.Arrays;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
/**
 *Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:

    Input: nums = [12,345,2,6,7896]
    Output: 2
    Explanation: 
    12 contains 2 digits (even number of digits). 
    345 contains 3 digits (odd number of digits). 
    2 contains 1 digit (odd number of digits). 
    6 contains 1 digit (odd number of digits). 
    7896 contains 4 digits (even number of digits). 
    Therefore only 12 and 7896 contain an even number of digits.
 */
public class FindNumberswithEvenNumberOfDigits {
    public static void main(String[] args) {
        
    }
    public int findNumbers(int[] nums) {
       int count=0;
       for(int i=0; i<nums.length; i++){
           boolean isEven=evenDigit(nums[i]);
           if(isEven){
               count++;
           }
       } 
       return count;
    }
    public boolean evenDigit(int num){
        int digit=numDigit(num);
        if(digit%2==0){
            return true;
        }
        return false;
    }

    public int numDigit(int num){
        int counter=0;
        while(num > 0){
            num=num/10;
            counter++;
        }

       return counter;
    }
}
