package Week3;

import java.util.Scanner;

public class _04Factorial {
    /**
     * Write a program that requests an integer number from the user and prints out the
     * multiplication from 1 to entered number. (Please use for loop)
     *  E.g.
     *
     * 1*2*3*4*5=120
     *     Input:
     *             5
     *     Output:
     *     Multiplication = 120
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = in.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("multiplication = " + factorial);
    }
}
