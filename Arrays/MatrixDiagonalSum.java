//https://leetcode.com/problems/matrix-diagonal-sum/description/
/**
 *Given a square matrix mat, return the sum of the matrix diagonals.
    Only include the sum of all the elements on the primary diagonal and all the
    elements on the secondary diagonal that are not part of the primary diagonal.
    * 
    * 
 Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
    Output: 25
    Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
    Notice that element mat[1][1] = 5 is counted only once.
 */
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        
    }
    public int diagonalSum(int[][] mat) {
        int sum=0;
        if(mat.length==1){
            return mat[0][0];
        }
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(i==j || i+j==mat.length-1){
                    sum=sum+mat[i][j];
                }
            }
        }
        return sum;
    }
}
