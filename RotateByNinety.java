import java.util.Scanner;

public class RotateByNinety {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = input.nextInt();
            }
        }

        rotate(matrix);

        System.out.println("Matrix after 90 degree rotation:");

        printMatrix(matrix);
    }

    // Rotate matrix 90 degrees clockwise
    public static void rotate(int[][] matrix) {

        // Step 1: Transpose the matrix
        for (int row = 0; row < matrix.length; row++) {
            for (int col = row + 1; col < matrix.length; col++) {

                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        // Step 2: Reverse every row
        for (int row = 0; row < matrix.length; row++) {

            int start = 0;
            int end = matrix[row].length - 1;

            while (start < end) {

                int temp = matrix[row][start];
                matrix[row][start] = matrix[row][end];
                matrix[row][end] = temp;

                start++;
                end--;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }

            System.out.println();
        }
    }
}
