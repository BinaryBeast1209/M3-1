import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of first matrix: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns of first matrix: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows of second matrix: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns of second matrix: ");
        int c2 = sc.nextInt();

        // Matrix multiplication is possible only when
        // columns of first matrix = rows of second matrix
        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        int[][] first = new int[r1][c1];
        int[][] second = new int[r2][c2];
        int[][] result = new int[r1][c2];

        System.out.println("Enter first matrix:");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                first[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                second[i][j] = sc.nextInt();
            }
        }

        // Multiply the matrices
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {

                for (int k = 0; k < c1; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        System.out.println("Result:");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
