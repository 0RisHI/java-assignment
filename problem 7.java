/*Write a program that takes an integer input n and prints a pyramid of
numbers up to n rows, where each row has an increasing count of
numbers. For example, if n = 4, the output should be:*/


import java.util.Scanner;

public class prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        printPyramid(n);
    }

    public static void printPyramid(int n) {
        int i, j;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // printing column values upto the row value
                System.out.print(j + " ");
            }

            // print new line for each row
            System.out.println();
        }
    }
}
