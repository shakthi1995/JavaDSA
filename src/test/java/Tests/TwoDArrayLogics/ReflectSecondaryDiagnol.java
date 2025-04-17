package Tests.TwoDArrayLogics;

import org.testng.annotations.Test;

public class ReflectSecondaryDiagnol {

    public int[][] reflectOverSecondaryDiagonal(int[][] matrix) {
        int size = matrix.length;
        int[][] newMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            // TODO: Complete the code to obtain the reflected square matrix in newMatrix.
            for(int j = 0; j< size; j++){
                newMatrix[j][i] = matrix[size-1-i][size-1-j];
            }
        }
        return newMatrix;
    }

    @Test
    public void VerifyReflectSecondaryDiagnol() {
        // Example square matrix to reflect over the secondary diagonal
        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // TODO: Call the function on squareMatrix and store the result in transformedMatrix.
        // Print the transformed matrix.
        int[][] output = reflectOverSecondaryDiagonal(squareMatrix);

        for(int[] row : output){
            for(int ele : row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
