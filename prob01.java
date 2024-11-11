/*  Write a Java program that takes an integer input from the user and
calculates the factorial of the number. Then, write a method to calculate
the sum of the digits of this factorial. For example, if the user enters 5,
calculate 5! (120) and then find the sum of its digits (1 + 2 + 0 = 3). */

import java.util.Scanner;

class prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter an integer");
        int num = sc.nextInt();
        sc.close();

        // Check if the input is within the range as big digit factorial can go long
        if (num < 0 || num > 20) {
            System.out.println("Please enter a number between 0 to 20.");
            return;
        }

        // Calculating the factorial of the number
        long fac = calcFac(num);
        System.out.println("Factorial of " + num + " is: " + fac);

        // Calculating sum of digits of the factorial
        int sumOfNums = calcSumOfNums(fac);
        System.out.println("Sum of the digit of the factorial: " + sumOfNums);

    }

    // Method to calculate factorial
    public static long calcFac(int n) {
        long res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    // Method to calculate sum of numbers
    public static int calcSumOfNums(long num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    
}