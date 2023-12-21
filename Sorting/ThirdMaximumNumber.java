package KKPracticeSet.Sorting;
//https://leetcode.com/problems/third-maximum-number/description/

import java.util.Arrays;
/**
 *Given an integer array nums, return the third distinct maximum number in this 
    array. If the third maximum does not exist, return the maximum number.
Example 1:
    Input: nums = [3,2,1]
    Output: 1
    Explanation:
    The first distinct maximum is 3.
    The second distinct maximum is 2.
    The third distinct maximum is 1.
 */
public class ThirdMaximumNumber {
    public static void main(String[] args) {
        
    }
    public int thirdMax(int[] nums) {
        if(nums.length < 3){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        
        long max=Long.MIN_VALUE;
        long smax=Long.MIN_VALUE;
        long tmax=Long.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                tmax=smax;
                smax=max;
                max=nums[i];
            }else if (nums[i]<max && nums[i]>smax) {
                tmax = smax;
                smax=nums[i];
            }else if (nums[i]<smax && nums[i]>tmax) {
                tmax=nums[i];
            }
        }

        return (tmax == Long.MIN_VALUE) ? (int) max : (int) tmax;
    }
}
