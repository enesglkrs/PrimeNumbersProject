import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void displayPrimes(int limit) {
        System.out.println("Prime numbers from 1 to " + limit + ":");
        for (int num = 1; num <= limit; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();
        displayPrimes(N);
        scanner.close();
    }
}
