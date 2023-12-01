

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12}};
        
        int target=7;
        System.out.println(Arrays.toString(linearSearch(arr, target)));
    }
    static int[] linearSearch(int [][] arr, int target){
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                int ele = arr[i][j];
                
                if (ele==target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
