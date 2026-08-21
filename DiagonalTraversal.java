import java.util.Scanner;

public class DiagonalTraversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        System.out.println("Diagonal traversal:");

        // Start diagonals from the top row
        for (int startCol = 0; startCol < n; startCol++) {

            int row = 0;
            int col = startCol;

            while (row < n && col < n) {
                System.out.print(matrix[row][col] + " ");
                row++;
                col++;
            }

            System.out.println();
        }

        // Start remaining diagonals from the first column
        for (int startRow = 1; startRow < n; startRow++) {

            int row = startRow;
            int col = 0;

            while (row < n && col < n) {
                System.out.print(matrix[row][col] + " ");
                row++;
                col++;
            }

            System.out.println();
        }
    }
}
