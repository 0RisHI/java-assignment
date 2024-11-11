/*Write a program that accepts n integers from the user (where n is also
provided by the user). Store the numbers in an array and write a method
to find and display the second largest number in the array */

import java.util.Scanner;




public class prob6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of integers: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Please enter at least two integers.");
            sc.close();
            return;
        }

        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int secondLargest = findSecondLargest(nums);
        System.out.println("The second largest number is: " + secondLargest);

        sc.close();
    }

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num: arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    
}
