// 867. Transpose Matrix
// Given a 2D integer array matrix, return the transpose of matrix.

// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] z = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                z[i][j]=matrix[j][i];
            }
        }
        return z;
        
    }
}
