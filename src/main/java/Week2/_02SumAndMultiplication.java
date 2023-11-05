package Week2;

import java.util.Scanner;

public class _02SumAndMultiplication {
    /**
     * Create a program that requests 2 integer numbers from the user and prints their sum and multiplication.
     * At the end, the program should display the result in the following format:
     * Total = 5
     * Multiplication = 6
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input first number:");
        int n = input.nextInt();
        System.out.println("Input second number:");
        int m = input.nextInt();

        int sum = n + m;
        int mult = n * m;

        System.out.println("____________________________");
        System.out.println("sum = " + sum);
        System.out.println("multiplication = " + mult);
        System.out.println("____________________________");
    }
}
