//https://leetcode.com/problems/maximum-product-of-three-numbers/description/
import java.util.Arrays;

/**
 *Given an integer array nums, find three numbers whose product is maximum and 
    return the maximum product.
Example 1:
    Input: nums = [1,2,3]
    Output: 6
 */
public class MaximumProductofThreeNumbers {
    public static void main(String[] args) {
        
    }
    public int maximumProduct(int[] nums) {
        int x=0;
        int y=0;
        int z=0;
        if(nums.length==3){
            x=nums[0];
            y=nums[1];
            z=nums[2];
            return prod(x,y,z);
        }

        Arrays.sort(nums);
/**
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
 */

        x=nums[nums.length-1];
        y=nums[nums.length-2];
        z=nums[nums.length-3];
        int product1=prod(x,y,z);

        x=nums[0];
        y=nums[1];
        z=nums[nums.length-1];
        int product2=prod(x,y,z);

        int maxi=product1;
        if(maxi < product2){
            maxi=product2;
        }

        return maxi;
    }
    public int prod(int x, int y, int z){
        return x*y*z;
    }

    public void swap(int[] nums, int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}

