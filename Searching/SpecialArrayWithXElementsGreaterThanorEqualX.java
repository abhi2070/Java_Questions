package KKPracticeSet.Searching;
//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/
/**
 *You are given an array nums of non-negative integers. nums is considered 
    special if there exists a number x such that there are exactly x numbers in 
    nums that are greater than or equal to x.
    Notice that x does not have to be an element in nums.
    Return x if the array is special, otherwise, return -1. It can be proven that if 
    nums is special, the value for x is unique.

Example 1:
    Input: nums = [3,5]
    Output: 2   
    Explanation: There are 2 values (3 and 5) that are greater than or equal to 2.
 */
public class SpecialArrayWithXElementsGreaterThanorEqualX {
    public static void main(String[] args) {
        
    }
    public int specialArray(int[] nums) {
        for(int x=1; x<=nums.length; x++){
            int count=0;
            for(int i=0; i<nums.length; i++){
                if(nums[i] >= x){
                    count++;
                }
            }
            if(x==count){
                return x;
            }
        }
        return -1;
    }
}
