import java.util.Scanner;

public class KTimeConcatenate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        String result = "";

        for (int i = 0; i < k; i++) {
            result += str;
        }

        System.out.println("Result: " + result);
    }
}
