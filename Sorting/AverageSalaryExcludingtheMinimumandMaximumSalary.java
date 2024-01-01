package KKPracticeSet.Sorting;
//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/

import java.util.Arrays;

/**
 *You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
    Return the average salary of employees excluding the minimum and maximum salary. 
    Answers within 10-5 of the actual answer will be accepted.
    
Example 1:

    Input: salary = [4000,3000,1000,2000]
    Output: 2500.00000
    Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
    Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
 */
public class AverageSalaryExcludingtheMinimumandMaximumSalary {
    public static void main(String[] args) {
        
    }
    public double average(int[] nums) {
        Arrays.sort(nums);
        double sum=0;
        int counter=0;
        for(int i=1; i<nums.length-1; i++){
            sum = sum+nums[i];
            counter++;
        }
        double ans=sum/counter;
        return ans;
    }
}
