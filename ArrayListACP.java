import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListACP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("Original ArrayList: " + numbers);

        // Add an element
        System.out.print("Enter an element to add: ");
        int value = sc.nextInt();
        numbers.add(value);

        System.out.println("After adding: " + numbers);

        // Change an element
        System.out.print("Enter index to change: ");
        int index = sc.nextInt();

        System.out.print("Enter new value: ");
        int newValue = sc.nextInt();

        numbers.set(index, newValue);

        System.out.println("After updating: " + numbers);

        // Remove an element
        System.out.print("Enter index to remove: ");
        int removeIndex = sc.nextInt();

        numbers.remove(removeIndex);

        System.out.println("After removing: " + numbers);

        // Display size
        System.out.println("Size of ArrayList: " + numbers.size());
    }
}
