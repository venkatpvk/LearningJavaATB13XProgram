package Tasks.June_27th;

import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
       // 2 dimensional array
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Loop to print the elements in the two-dimensional array
        for (int rows = 0; rows < array.length; rows++) {
            for (int columns = 0; columns < array[rows].length; columns++) {
                System.out.print(array[rows][columns]+"\t");
            }
            System.out.println();
        }

        System.out.println("***********************************************************************************************");

        // Creating a transpose of a matrix
        int rows = array.length;
        int columns = array[0].length;

        // Transposed Matrix
        int[][] transposedMatrix = new int[columns][rows];

        //  changing normal to transpose matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = array[i][j];
            }
        }

        // Loop to print the elements in the two-dimensional array
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
