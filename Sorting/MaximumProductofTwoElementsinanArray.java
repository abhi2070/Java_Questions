package KKPracticeSet.Sorting;

import java.util.Arrays;
//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
/** 
 * Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 
Example 1:
    Input: nums = [3,4,5,2]
    Output: 12 
    Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get 
    the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
 */

public class MaximumProductofTwoElementsinanArray {
    public static void main(String[] args) {
     
    }
     public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int a=nums[nums.length-1];
        int b=nums[nums.length-2];
        int c=a-1;
        int d=b-1;

        return c*d;
    }
}
