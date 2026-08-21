import java.util.Scanner;

public class SearchArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int index = 0; index < size; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.print("Enter the number you want to find: ");
        int target = input.nextInt();

        int position = search(numbers, target);

        System.out.println(position);
    }

    public static int search(int[] numbers, int target) {

        int position = -1;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == target) {
                position = index;
                break;
            }
        }

        return position;
    }
}
