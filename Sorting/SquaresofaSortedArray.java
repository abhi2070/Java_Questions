package KKPracticeSet.Sorting;
//https://leetcode.com/problems/squares-of-a-sorted-array/description/

import java.util.Arrays;

/**
 *Given an integer array nums sorted in non-decreasing order, return an array of 
 the squares of each number sorted in non-decreasing order.

Example 1:

    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Explanation: After squaring, the array becomes [16,1,0,9,100].
    After sorting, it becomes [0,1,9,16,100].
 */
public class SquaresofaSortedArray {
    public static void main(String[] args) {
        
    }
    public int[] sortedSquares(int[] nums) {
        //this will return nums with all positive number
        for(int j=0; j<nums.length; j++){
            if(nums[j]<0){
                nums[j]=Math.abs(nums[j]);
            }else{
                nums[j]=nums[j];
            }
        }
        //this will sort array
        Arrays.sort(nums);    
        //to find square root    
        int[] ans=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i]= nums[i]*nums[i];
        }
        return ans;
    }
}
