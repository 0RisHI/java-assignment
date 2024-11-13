/*Write a program that takes an integer input n and stores the first n terms
of the Fibonacci sequence in an array. Then, print the array. For example,
if the user enters 7, store and display the first 7 terms of the Fibonacci
sequence: 0, 1, 1, 2, 3, 5, 8. */


import java.util.Scanner;

public class prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for fibonacci sequence: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter positeve number.");
        } else {
            int [] fib = new int[n];

            // Inserting the values in array
            for (int i = 0; i < n; i++) {
                fib[i] = fibRecurr(i);
            }

            // PRint the fibonacci sequence.

            System.out.println("Fibonacci Sequence: ");
            for (int i = 0; i < n; i++) {
                // Below is the terninary operator if else in single line.
                System.out.println(fib[i] + (i < n - 1 ? ", " : ""));
            }
        }
        sc.close();
    }

    // Method for finding fibonacci sequence by recurrsive approach.

    public static int fibRecurr(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecurr(n - 1) + fibRecurr(n - 2);
    }
}
