package KKPracticeSet.Arrays;
//https://leetcode.com/problems/running-sum-of-1d-array/description/
/**
 * Given an array nums. We define a running sum of an array as 
 * runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * @author ASUS
 */
public class SumOf1DArray {
    public static void main(String[] args) {
        
    }
    static int[] runningSum(int[] nums) {
        int[] ans=new int[nums.length];
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum=sum+nums[i];
            ans[i]=sum;
        }
        return ans;
    }
}
