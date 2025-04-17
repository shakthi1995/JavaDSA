package Tests.TwoDArrayLogics;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class VerticalTraverse {

    public List<Integer> verticalTraverse(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = rows-1;
        int col = cols-1;
        List<Integer> result = new ArrayList<>();
        //String direction = "up";
        // TODO: Append each element's value to the result list by following the vertical pattern.
        while(result.size() < rows * cols){
            result.add(matrix[row][col]);

            if(row-1 < 0){
                col = col -1;
                row = rows-1;
            }else{
                row = row-1;
            }
        }
        return result;
    }

    @Test
    public void TestForVerticalTraverse() {
        int[][] data = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        List<Integer> traversal = verticalTraverse(data);
        for (int num : traversal) {
            System.out.print(num + " ");
        }
    }
}
