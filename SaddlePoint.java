import java.util.Scanner;

public class SaddlePoint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean found = false;

        for (int i = 0; i < rows; i++) {

            // Find the smallest element in the current row
            int minCol = 0;

            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < matrix[i][minCol]) {
                    minCol = j;
                }
            }

            // Check whether it is the largest element in its column
            boolean isSaddle = true;

            for (int k = 0; k < rows; k++) {
                if (matrix[k][minCol] > matrix[i][minCol]) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle point: " + matrix[i][minCol]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Invalid input");
        }
    }
}
