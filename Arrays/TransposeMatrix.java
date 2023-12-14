//https://leetcode.com/problems/transpose-matrix/description/
/**
 *Given a 2D integer array matrix, return the transpose of matrix.
    The transpose of a matrix is the matrix flipped over its main diagonal,
    switching the matrix's row and column indices.
    
    Example 1:
    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [[1,4,7],[2,5,8],[3,6,9]]
 */
public class TransposeMatrix {
    public static void main(String[] args) {
        
    }
    public int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int coloumn=matrix[0].length;

        int[][] ans=new int[coloumn][rows];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
}
