package Week3;

import java.util.Scanner;

public class _03PrintYesOrNo {
    /**Write a program that requests numbers from the user. The program should print YES if the number is even and
     * print NO if the number is odd. When user enters 0 the program should stop and print the sum of even numbers.
     * E.g.
     *        Input:
     *        2
     *        5
     *        12
     *        7
     *        14
     *        13
     *        0
     * Output:
     * YES
     * NO
     * YES
     * NO
     * YES
     * NO
     * Total of even numbers: 28
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = in.nextInt();
        int sum = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                sum = sum + n;
                System.out.println("YES");
                n = in.nextInt();
            } else {
                System.out.println("NO");
                n = in.nextInt();
            }
        }

        System.out.println("sum = " + sum);
    }
}

