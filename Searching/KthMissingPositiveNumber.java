//https://leetcode.com/problems/kth-missing-positive-number/description/

import java.util.ArrayList;
import java.util.List;

/**
 *Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
    Return the kth positive integer that is missing from this array.
Example 1:

    Input: arr = [2,3,4,7,11], k = 5
    Output: 9
    Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 
    5th missing positive integer is 9.
 */
public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        
    }
   public int findKthPositive(int[] arr, int k) {
        List<Integer> ans=new ArrayList<>();
        int x=0;
        int i=1;
        int counter=1;
        while(true){
            if(arr[x] != i){
                if(counter==k){
                    return i;
                }
                i++;
                counter++;
            }else if(x<arr.length-1 && arr[x]==i){
                x++;
                i++;
            }else{
                i++;
            }
        }
    }
}
