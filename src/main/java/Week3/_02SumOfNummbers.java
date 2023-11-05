package Week3;

import java.util.Scanner;

public class _02SumOfNummbers {
    /** Write a program that requests numbers from the user. The program should stop asking for
     * numbers when user enters 0. At the end program should print the sum of entered numbers
     * E.g.
     * Input:
     * 3
     * 6
     * 9
     * 0
     * Output:
     * 18
     **/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = 0;

        while (n != 0) {
            sum = sum + n;
            n = input.nextInt();
        }

        System.out.println("sum = " + sum);
    }
}
