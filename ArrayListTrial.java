import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTrial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> data = new ArrayList<>();

        System.out.print("Enter number of arrays: ");
        int count = sc.nextInt();

        // Create each ArrayList
        for (int i = 0; i < count; i++) {

            System.out.print("Enter size of array " + (i + 1) + ": ");
            int size = sc.nextInt();

            ArrayList<Integer> current = new ArrayList<>();

            System.out.println("Enter elements:");

            for (int j = 0; j < size; j++) {
                current.add(sc.nextInt());
            }

            data.add(current);
        }

        System.out.print("Enter number of queries: ");
        int queries = sc.nextInt();

        // Process queries
        for (int q = 0; q < queries; q++) {

            System.out.print("Enter row and column: ");

            int row = sc.nextInt();
            int column = sc.nextInt();

            if (row >= 1 && row <= data.size()
                    && column >= 1
                    && column <= data.get(row - 1).size()) {

                System.out.println(data.get(row - 1).get(column - 1));

            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
