package KKPracticeSet.Sorting;
//https://leetcode.com/problems/minimum-absolute-difference/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *Given an array of distinct integers arr, find all pairs of elements with the 
    minimum absolute difference of any two elements.
    Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
    a, b are from arr
    a < b
    b - a equals to the minimum absolute difference of any two elements in arr

Example 1:
    Input: arr = [4,2,1,3]
    Output: [[1,2],[2,3],[3,4]]
    Explanation: The minimum absolute difference is 1. List all pairs with difference 
    equal to 1 in ascending order.
 */
public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int mindif = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i + 1] && arr[i + 1] - arr[i] < mindif) {
                mindif = arr[i + 1] - arr[i];
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int j = 0; j < arr.length-1; j++){
            if(arr[j + 1] - arr[j] == mindif)
            ans.add(Arrays.asList(arr[j], arr[j+1]));
        }

        return ans;
    }
}
