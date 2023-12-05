
//https://leetcode.com/problems/intersection-of-two-arrays/description/
/**
 *Given two integer arrays nums1 and nums2, return an array of their 
 * intersection. Each element in the result must be unique and you may return 
 * the result in any order.

Example 1:
    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2]
 */
import java.util.ArrayList;
import java.util.List;
public class IntersectionOfTwoNumber {
    public static void main(String[] args) {
        
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans=new ArrayList<>();

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                int element=nums2[j];
                if(nums1[i] == element && (!ans.contains(element))){
                    ans.add(element);
                }
            }
        }
        int[] arr=new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}
