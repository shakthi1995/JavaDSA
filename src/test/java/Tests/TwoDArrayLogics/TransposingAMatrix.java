package Tests.TwoDArrayLogics;

import org.testng.annotations.Test;

public class TransposingAMatrix {

    public int[][] transformMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = rows > 0 ? matrix[0].length : 0;
        int[][] result = new int[cols][rows];

        for (int row = 0; row < rows; ++row) {
            for (int col = 0; col< col; ++col) {
                result[col][row] = matrix[row][col];
            }
        }
        return result;
    }

    @Test
    public void VerifyTransposeMatrix() {
        // Initial matrix (2D array)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Call our function on the matrix and output the result
        int[][] transposed = transformMatrix(matrix);
        for (int[] row : transposed) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
