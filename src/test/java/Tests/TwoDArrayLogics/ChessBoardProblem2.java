package Tests.TwoDArrayLogics;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ChessBoardProblem2 {

    public List<int[]> findHorizontalPositions(char[][] board) {
        List<int[]> positions = new ArrayList<>();

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'E') {
                    if ((j > 0 && board[i][j - 1] == 'E') ||
                            (j < cols - 1 && board[i][j + 1] == 'E')) {
                        positions.add(new int[]{i, j});
                    }
                }
            }
        }
        return positions;
    }

    @Test
    public void PrintAvailableHorizontalPositions() {
        char[][] board = {
                {'P', 'E', 'E', 'P'},
                {'E', 'P', 'E', 'P'},
                {'P', 'E', 'P', 'P'},
                {'P', 'E', 'P', 'E'}
        };

        List<int[]> positions = findHorizontalPositions(board);

        for (int[] pos : positions) {
            System.out.println("(" + pos[0] + ", " + pos[1] + ")");
        }
    }
}
