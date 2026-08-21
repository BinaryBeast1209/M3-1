import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrime {

    // Remove all prime numbers from the list
    public static void removePrimes(ArrayList<Integer> numbers) {

        for (int i = numbers.size() - 1; i >= 0; i--) {

            if (checkPrime(numbers.get(i))) {
                numbers.remove(i);
            }
        }
    }

    // Check whether a number is prime
    public static boolean checkPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= num; divisor++) {

            if (num % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        removePrimes(numbers);

        System.out.println("ArrayList after removing primes:");
        System.out.println(numbers);
    }
}
