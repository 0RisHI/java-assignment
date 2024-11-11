/* Take a string input from the user and a character to search for. Write a method to count the occurrences
 * of the character in the string and return the count. Then display the count to the user.
 */

import java.util.Scanner;


public class prob10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Enter a character to search: ");
        char searchChar = sc.next().charAt(0);

        int count = countOccurrences(input, searchChar);

        System.out.println("Character '" + searchChar + "' occurs " + count + " times.");
    }

    public static int countOccurrences(String str, char c) {
        int count = 0;
        for (char ch: str.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count++;
    }
}
