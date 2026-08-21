import java.util.ArrayList;
import java.util.Scanner;

public class SwapFirstLast {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Original List: " + list);

        if (list.size() > 1) {

            int first = list.get(0);
            int last = list.get(list.size() - 1);

            list.set(0, last);
            list.set(list.size() - 1, first);
        }

        System.out.println("After swapping first and last: " + list);
    }
}
