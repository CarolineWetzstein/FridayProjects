package Week3;

import java.util.Scanner;

public class _07MultiplicationTables {
    /**
     * Write a program that prints out the multiplication table from 1 to 10. The result should be:
     *(Please use nested for loop)
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = 10;
        int result = 0;

        for (int n = 1; n <= 10; n++) {
            System.out.println(" ");
            System.out.println("________________________");
            System.out.println("TABLE " + n);

            for (int j = 1; j <= m; j++) {
                result = n * j;
                System.out.println(n + " * " + j + " = " + result);
            }
        }
        System.out.println(" ");
        System.out.println("________________________");
    }
}

