package Week2;

import java.util.Scanner;

public class _06PrintText {
    /**
     * Write a program that requests any text (String text) and any number (int n) from the console and display
     * this word n times on the screen.
     * E.g.
     * String text = Hello World!
     * int n = 5
     * Output:
     * Hello World!
     * Hello World!
     * Hello World!
     * Hello World!
     * Hello World!
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your text");
        String text = input.nextLine();
        System.out.println("Please enter how many times the text should be printed");
        int n = input.nextInt();
        int i = 0;

        while (i < n) {
            System.out.println(text + " ");
            i++;
        }
    }
}
