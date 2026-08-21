import java.util.ArrayList;
import java.util.Scanner;

public class ReverseList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        ArrayList<Integer> reversed = reverseList(numbers);

        System.out.println("Original List: " + numbers);
        System.out.println("Reversed List: " + reversed);
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> numbers) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = numbers.size() - 1; i >= 0; i--) {
            result.add(numbers.get(i));
        }

        return result;
    }
}
