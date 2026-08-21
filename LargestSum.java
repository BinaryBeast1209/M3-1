import java.util.Scanner;

public class LargestSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int currentSum = arr[0];
        int largestSum = arr[0];

        for (int i = 1; i < n; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);

            largestSum = Math.max(largestSum, currentSum);
        }

        System.out.println("Maximum contiguous sum is " + largestSum);
    }
}
