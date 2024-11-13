/* Create a program that accepts 10 integers from the user, stores them in
an array, and then prints only the prime numbers in that array.
Implement a separate method to check if a number is prime. */



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Prime numbers in the array:");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
