import java.util.Scanner;

public class RingRotate {

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

        System.out.print("Enter ring number: ");
        int ring = sc.nextInt();

        System.out.print("Enter number of rotations: ");
        int rotations = sc.nextInt();

        rotateRing(matrix, ring, rotations);

        printMatrix(matrix);
    }

    // Rotate a particular ring
    public static void rotateRing(int[][] matrix, int ring, int rotations) {

        int[] elements = extractRing(matrix, ring);

        rotate(elements, rotations);

        insertRing(matrix, ring, elements);
    }

    // Extract the ring into a 1D array
    public static int[] extractRing(int[][] matrix, int ring) {

        int top = ring - 1;
        int left = ring - 1;
        int bottom = matrix.length - ring;
        int right = matrix[0].length - ring;

        int size = 2 * (bottom - top + right - left);

        int[] ringElements = new int[size];

        int index = 0;

        // Left side: top to bottom
        for (int i = top; i <= bottom; i++) {
            ringElements[index++] = matrix[i][left];
        }

        // Bottom side: left to right
        for (int j = left + 1; j <= right; j++) {
            ringElements[index++] = matrix[bottom][j];
        }

        // Right side: bottom to top
        for (int i = bottom - 1; i >= top; i--) {
            ringElements[index++] = matrix[i][right];
        }

        // Top side: right to left
        for (int j = right - 1; j > left; j--) {
            ringElements[index++] = matrix[top][j];
        }

        return ringElements;
    }

    // Rotate the 1D array
    public static void rotate(int[] arr, int rotations) {

        rotations = rotations % arr.length;

        if (rotations < 0) {
            rotations += arr.length;
        }

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, rotations - 1);
        reverse(arr, rotations, arr.length - 1);
    }

    // Reverse part of an array
    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Put the rotated elements back into the matrix
    public static void insertRing(int[][] matrix, int ring, int[] elements) {

        int top = ring - 1;
        int left = ring - 1;
        int bottom = matrix.length - ring;
        int right = matrix[0].length - ring;

        int index = 0;

        // Left side
        for (int i = top; i <= bottom; i++) {
            matrix[i][left] = elements[index++];
        }

        // Bottom side
        for (int j = left + 1; j <= right; j++) {
            matrix[bottom][j] = elements[index++];
        }

        // Right side
        for (int i = bottom - 1; i >= top; i--) {
            matrix[i][right] = elements[index++];
        }

        // Top side
        for (int j = right - 1; j > left; j--) {
            matrix[top][j] = elements[index++];
        }
    }

    // Display the matrix
    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
