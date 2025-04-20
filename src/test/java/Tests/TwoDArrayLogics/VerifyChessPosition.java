package Tests.TwoDArrayLogics;

import org.testng.annotations.Test;

public class VerifyChessPosition {

    // Function to check if a position is strategic
    private boolean isPositionStrategic(char[][] board, int row, int col) {
        int rows = board.length;
        int cols = board[0].length;
        if((row > 0 && board[row - 1][col] == 'E') || (row < rows-1 && board[row + 1][col] == 'E')
                || (col > 0 && board[row][col -1 ] == 'E') || (col < cols-1 && board[row][col + 1] == 'E')
            // TODO: Complete the remaining conditions for down, left, and right
        ){
            return true;
        }else{
            return false;
        }
    }

    @Test
    public void PrintStrategicPosition() {
        // Board game configuration: 'E' for empty, 'P' for piece
        char[][] gameBoard = {
                {'E', 'P'},
                {'P', 'E'}
        };

        boolean result = isPositionStrategic(gameBoard, 0, 1);
        System.out.println(result);
        // TODO: Check if position (0, 1) is strategic and print the result

    }
}
