package KKPracticeSet.Sorting;

import java.util.Arrays;
public class Dubplicate {
    public static void main(String[] args) {
      int[]  nums = {1,2,3,1};
      containsDuplicate(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(containsDuplicate(nums));
    }
     static boolean containsDuplicate(int[] nums) {
        boolean swaping=false;
        for(int i=0; i<nums.length; i++){
            swaping=false;
            for(int j=1; j<nums.length-1; j++){
                if(nums[j] < nums[j-1]){
                    swap(nums, j, j-1);
                    swaping=true;
                }
            }
            if(!swaping){
                break;
            }    
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1])
                return true;
        }
        return false;
        //Brute force approach
        //for(int i=0; i<nums.length; i++){
        //    for(int j=i+1; j<nums.length; j++){
        //        if(nums[i] == nums[j] && i != j){
        //            return true;
        //        }
        //    }   
        //}
        //return false;
    }

    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
