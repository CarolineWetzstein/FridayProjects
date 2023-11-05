package Week2;

import java.util.Scanner;

public class _07PrintOddNumbers {
    /**
     * Write a program that requests for an integer number (int n) from the user and displays all the ODD numbers
     * from 0 to n. (Odd numbers are numbers that are not divisible by 2 without a remainder).
     * E.g.
     * n=10
     * Output:
     * 1 3 5 7 9
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int n = input.nextInt();
        int odd = 0;

        while (odd <= n) {
            if (odd % 2 == 1) {
                System.out.print(odd + " ");
            }
            odd++;
        }
    }
}
