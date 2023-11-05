package Week3;

import java.util.Scanner;

public class _05MultiplicationTable2 {
    /**
     * Write a program that prints out the multiplication table of 2.
     * The result should be: 2 x 2 = 4 ....
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 2;
        int m = 10;
        int result = 0;

        System.out.println("________________________________");
        System.out.println("Multiplication table of 2");
        System.out.println("________________________________");

        for (int i = 1; i <= m; i++) {
            result = i * n;

            System.out.println(n + " * " + i + " = " + result);
        }
        System.out.println("________________________________");
    }
}
