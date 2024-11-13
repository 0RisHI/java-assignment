/*  Write a Java program that takes an integer input from the user and
calculates the factorial of the number. Then, write a method to calculate
the sum of the digits of this factorial. For example, if the user enters 5,
calculate 5! (120) and then find the sum of its digits (1 + 2 + 0 = 3). */

import java.util.Scanner;

public class Main  { 
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            long factorial = calculateFactorial(number);
            int digitSum = calculateDigitSum(factorial);

            System.out.println("Factorial of " + number + " is: " + factorial);
            System.out.println("Sum of digits of the factorial is: " + digitSum);
        }

        scanner.close();
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static int calculateDigitSum(long num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
    }
    
}
