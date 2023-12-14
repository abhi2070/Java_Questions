//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *Given two integer arrays nums1 and nums2, return an array of their intersection. 
    Each element in the result must appear as many times as it shows in both arrays 
    and you may return the result in any order.

Example 1:

    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2,2]
 */
public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
        
    }
     public int[] intersect(int[] nums1, int[] nums2) {
          Arrays.sort(nums1);
          Arrays.sort(nums2);
        
        List<Integer> ans=new ArrayList<>();
        int i=0, j=0;
        while(i<nums1.length && j < nums2.length){
                if(nums1[i] == nums2[j]){
                    ans.add(nums1[i]);
                    i++;
                    j++;
                }else if (nums1[i] < nums2[j]) {
                    i++;
                } else {
                    j++;
                }
            }

        int[] res= new int[ans.size()];

        for(int k=0; k<ans.size(); k++){
            res[k]=ans.get(k);
        }

        return res;
    }
}
