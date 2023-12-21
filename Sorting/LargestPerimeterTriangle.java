package KKPracticeSet.Sorting;
//https://leetcode.com/problems/largest-perimeter-triangle/description/

import java.util.Arrays;

/**
 *Given an integer array nums, return the largest perimeter of a triangle with a 
 non-zero area, formed from three of these lengths. If it is impossible to form any 
 triangle of a non-zero area, return 0.

Example 1:

    Input: nums = [2,1,2]
    Output: 5
    Explanation: You can form a triangle with three side lengths: 1, 2, and 2.
 */
public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        
    }
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int peri=0;
        for(int i=nums.length-1; i>=2; i--){
            if(nums[i-2]+nums[i-1] > nums[i]){
                peri = nums[i-2]+nums[i-1]+nums[i];
                break;
            }
        }
        return peri;
    }
}
