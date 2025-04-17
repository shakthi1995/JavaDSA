package Tests.TwoDArrayLogics;

import org.testng.annotations.Test;

public class ReverseTransposingAMatrix {
    public int[][] transformMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return new int[0][0];

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposed = new int[cols][rows];

        // TODO: Modify the loop to transpose the matrix in reverse order
        for(int row = 0; row < rows; row++ ){
            for(int col = 0; col < cols; col++){
                transposed[cols-1-col][row] = matrix[row][col];
            }
        }

        return transposed;
    }

    @Test
    public void VerifyReverseTransponse() {
        int[][] seatingChart = {
                {101, 102, 103, 104},
                {201, 202, 203, 204},
                {301, 302, 303, 304}
        };

        // TODO: Store the result of transformMatrix in transposedSeating and print it
        int[][] reverseTransposedSeatingChart = transformMatrix(seatingChart);
        for(int[] chart : reverseTransposedSeatingChart){
            for(int ele : chart){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
