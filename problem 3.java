/*Build a menu-driven calculator that performs addition, subtraction,
multiplication, or division based on the user's choice. Use if-else
statements to determine the operation.
Keep prompting the user to perform another operation until they choose
to exit. */



import java.util.Scanner;

public class prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.println("Choose an operation: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting calculator.....");
                break;
            }

            System.out.println("Enter the first number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();

            if (choice == 1) {
                System.out.println("Result: " + (num1 + num2));
            } else if (choice == 2) {
                System.out.println("Result: " + (num1 - num2));
            } else if (choice == 3) {
                System.out.println("Result: " + (num1 * num2));
            } else if (choice == 4) {
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not alllowed");
                }
            } else {
                System.out.println("Invalid choice. Please try again later");
            }
        }
        sc.close();
    }
}
