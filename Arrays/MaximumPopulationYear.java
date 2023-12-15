package KKPracticeSet.Arrays;
//https://leetcode.com/problems/maximum-population-year/description/
/**
 *You are given a 2D integer array logs where each logs[i] = [birthi, deathi] 
    indicates the birth and death years of the ith person.
    The population of some year x is the number of people alive during that year. 
    The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.

    Return the earliest year with the maximum population.

Example 1:

    Input: logs = [[1993,1999],[2000,2010]]
    Output: 1993
    Explanation: The maximum population is 1, and 1993 is the earliest year with this population.
 */
public class MaximumPopulationYear {
    public static void main(String[] args) {
        
    }
    public int maximumPopulation(int[][] logs) {
        int[] arr=new int[101];

        for(int[] log:logs){
            int by=log[0], dy=log[1];
            arr[by-1950]++;
            arr[dy-1950]--;
        }

        int max=arr[0];
        int maxYear=1950;
        for(int i=1; i<101; i++){
            arr[i] +=arr[i-1];
            if(max<arr[i]){
                max =arr[i];
                maxYear=i+1950;
            }
        }
        return maxYear;
    }
}
