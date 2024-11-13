/* Create a program that accepts 10 integers from the user, stores them in
an array, and then prints only the prime numbers in that array.
Implement a separate method to check if a number is prime. */



import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.println("Enter 10 integers:");

        for (int i=0; i<10; i++) {
            System.out.println("Enter integer " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Prime numbers in array: ");

        // num is the single value that which hold the values in nums one ny one each iteration

        for (int num: nums) {
            if (isPrime(num)) {
                System.out.println(num + " ");
            }
        }

    }

    // MEthod which return true or false based on if number is prime or not
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
