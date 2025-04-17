package Tests.TwoDArrayLogics;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TraverseOrderAnother {
    @Test
    public void PrintTraverseOrder() {
        int[][] library = {
                {1, 3, 5, 7},
                {2, 4, 6, 8},
                {9, 11, 13, 15}
        };

        // Starting from the bottom right corner of the bookshelf
        int row = library.length - 1;
        int col = library[0].length - 1;
        boolean goingUp = true;

        List<Integer> result = new ArrayList<>();

        while (col >= 0) {
            result.add(library[row][col]);
            if (goingUp) {
                if (row == 0) {
                    goingUp = false;
                    col -= 1;
                } else {
                    row -= 1;
                }
            } else {
                if (row == library.length - 1) {
                    goingUp = true;
                    col -= 1;
                } else {
                    row += 1;
                }
            }
        }

        System.out.println(result);
    }
}
