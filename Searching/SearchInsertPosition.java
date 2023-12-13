package KKPracticeSet.Searching;
//https://leetcode.com/problems/search-insert-position/description/
/**
 *Given a sorted array of distinct integers and a target value, return the index 
    if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

    Input: nums = [1,3,5,6], target = 5
    Output: 2
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        
    }
    public int searchInsert(int[] nums, int target) {
       int index=0;
       for(int i=0; i<nums.length; i++){
           if(nums[i]==target){
               index=i;
               break;
           }else if(nums[i] >= target){
               index=i;
               break;
           }else{
               index=i+1;
           }
       }
       return index;
        /**
        if(target==0 || nums.length==1){
            return 0;
        }
        int start=0;
        int end=nums.length-1;

        while(start < end){
            int mid=start+(end-start)/2;
            if(nums[mid] < target){
                start=mid+1;
                if(start==end){
                    return start+1;
                }
            }else if(nums[mid] > target){
                end=mid-1;
                if(start==end){
                    return start+1;
                }
            }else{
                return mid;
            }
        }
        return -1;
         */       
    }
}
