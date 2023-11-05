package Week3;

import java.util.Scanner;

public class _06SumNumbersDiff6And10 {
    /**
     * Write a program that asks 6 numbers from the user and prints the sum of the numbers which are not in
     * between 6 and 10 included.

     *  E.g.
     * Input:
     * 2
     * 5
     * 8
     * 7
     * 10
     * 11
     * Output: 18 (Just the sum of 2, 5 & 11)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Please enter the number " + i + ":");
            int n = scanner.nextInt();

            if (n < 6 || n>10) {
                sum += n;
            }
        }

        System.out.println("The sum of numbers not between 6 and 10 is: " + sum);
    }
}
