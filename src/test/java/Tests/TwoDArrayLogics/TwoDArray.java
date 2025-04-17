package Tests.TwoDArrayLogics;

import org.testng.annotations.Test;

import java.util.Arrays;

public class TwoDArray {
    @Test
    public void Int2DArray() {
        // Creating a 2D array
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Printing the 2D array
        System.out.println(Arrays.deepToString(array));
    }

    @Test
    public void String2DArray() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing an element
        System.out.println(array[1][0]);  // Outputs: 4
    }

    @Test
    public void PrintingStr2DArray() {
        String[][] array = {
                {"Apt 101", "Apt 102", "Apt 103"},
                {"Apt 201", "Exit Floor", "Apt 203"},
                {"Apt 301", "Apt 302", "Apt 303"}
        };

        // Loop through 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public void Updating2DArray() {
        // Defining and initializing the array
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Updating an element
        array[0][1] = 10;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void AddingRowIn2DArray(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Adding a new row to our array
        int[][] newArray = new int[array.length + 1][3];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = Arrays.copyOf(array[i], array[i].length);
        }
        newArray[3] = new int[]{10, 11, 12};

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void RemovingRowIn2DArray() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Removing the second column
        int[][] newArray = new int[array.length][array[0].length - 1];
        for (int i = 0; i < array.length; i++) {
            int index = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (j != 1) {
                    newArray[i][index] = array[i][j];
                    index++;
                }
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void ImplementingBreakIn2dArray() {
        String[][] array = {
                {"Apt 101", "Apt 102", "Apt 103"},
                {"Apt 201", "Exit Floor", "Apt 203"},
                {"Apt 301", "Apt 302", "Apt 303"}
        };

        // Break in nested loop
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals("Exit Floor")) {
                    break;
                }
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
    }

    @Test
    public void ImplementingContinueIn2dArray() {
        String[][] array = {
                {"Apt 101", "Apt 102", "Apt 103"},
                {"Apt 201", "Exit Floor", "Apt 203"},
                {"Apt 301", "Apt 302", "Apt 303"}
        };

        // Break in nested loop
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals("Exit Floor")) {
                    continue;
                }
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
    }


}
