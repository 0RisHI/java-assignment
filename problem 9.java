/* Implement a program that accepts an integer input n and prints Floyd's Triangle up to n rows.
 * Floyd's Triangle has consecutive numbers starting from 1. For example, if n = 4, the output should be:
 */

 import java.util.Scanner;

 public class prob9 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of rows: ");
         int n = sc.nextInt();
         printInvPyramid(n);
     }
 
     public static void printInvPyramid(int n) {
         int i, j;
         int num = 1;
         // outer loop to handle number of rows
         for (i = 1; i <= n; i++) {
             // inner loop to handle number of columns
             for (j = 1; j <= i; j++) {
                 // printing value of num in each iteration
                 System.out.print(num+ " ");
                //  increasing the value of num.
                num++;
             }
 
             // print new line for each row
             System.out.println();
         }
     }
 }
