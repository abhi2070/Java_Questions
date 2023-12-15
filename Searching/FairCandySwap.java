package KKPracticeSet.Searching;
//https://leetcode.com/problems/fair-candy-swap/description/
/**
 *Alice and Bob have a different total number of candies. You are given two 
 * integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of 
 * candies of the ith box of candy that Alice has and bobSizes[j] is the number 
 * of candies of the jth box of candy that Bob has.

Since they are friends, they would like to exchange one candy box each so that 
* after the exchange, they both have the same total amount of candy. The total 
* amount of candy a person has is the sum of the number of candies in each box they have.

Return an integer array answer where answer[0] is the number of candies in the 
* box that Alice must exchange, and answer[1] is the number of candies in the 
* box that Bob must exchange. If there are multiple answers, you may return any 
* one of them. It is guaranteed that at least one answer exists.

Example 1:
Input: aliceSizes = [1,1], bobSizes = [2,2]
Output: [1,2]
 */
public class FairCandySwap {
    public static void main(String[] args) {
        
    }
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int n=aliceSizes.length;
        int m=bobSizes.length;
        int aliceSum=0;
        int bobSum=0;
        for (int i = 0; i < n; i++) {
            aliceSum += aliceSizes[i];
        }
        for (int j = 0; j < m; j++) {
            bobSum += bobSizes[j];
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(bobSum - bobSizes[j] + aliceSizes[i] == aliceSum - aliceSizes[i] + bobSizes[j]){
                      return new int[] {aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return new int[]{-1,-1}; 
    }
}
