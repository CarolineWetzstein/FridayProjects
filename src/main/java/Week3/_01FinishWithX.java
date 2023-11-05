package Week3;

import java.util.Scanner;

public class _01FinishWithX {
    /**
     * Write a program which prints “In progress…” until user enters ‘x’ from the console and
     * when user enters ‘x’, program should print “Process finished without error…”
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a letter:");
        String input = in.nextLine();
        String letter = "x";

        while (!input.equals(letter)) {
            System.out.println("In progress...");
            System.out.print("Enter another letter:");
            input = in.nextLine();
        }
        System.out.println("Process finished without error.");
    }
}


