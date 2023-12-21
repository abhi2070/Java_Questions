package KKPracticeSet.Sorting;
//https://leetcode.com/problems/sort-array-by-parity/description/

import java.util.Arrays;

/**
 *Given an integer array nums, move all the even integers at the beginning of 
    the array followed by all the odd integers.
    Return any array that satisfies this condition.
    *Example 1:

    Input: nums = [3,1,2,4]
    Output: [2,4,3,1]
    Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */
public class SortArrayByParity {
    public static void main(String[] args) {
        
    }
    public int[] sortArrayByParity(int[] nums) {
        int[] ans=new int[nums.length];
        if(nums[0]==0 && nums.length==1){
            return nums;
        }
        Arrays.sort(nums);
        int i=0;
        int j = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                ans[i++] = num;
            } else {
                ans[j--] = num;
        }
    }
        return ans;
    }
}
