package Tasks.June_27th;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] array = {
                { 4, 5, 6, 7 },
                { 1, 7, 3, 4 },
                { 11, 12, 13, 14 },
                { 23, 24, 25, 50 }
        };
        int matrix_size = 4;

        // Looping through to calculate the sum of diagonal
        int principalDiagonal = 0;
        int secondaryDiagonal = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    principalDiagonal = principalDiagonal + array[i][j];
                }
                if ((i + j) == (matrix_size - 1)) {
                    secondaryDiagonal = secondaryDiagonal + array[i][j];
                }
            }
        }
        System.out.printf("Principle Matrix = %d\nSecondaryMatrix = %d", principalDiagonal, secondaryDiagonal);

    }
}
