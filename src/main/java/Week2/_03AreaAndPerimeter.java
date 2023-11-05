package Week2;

import java.util.Scanner;

public class _03AreaAndPerimeter {
    /**
     * Create a program that requests side length of a square in cm from the user and calculates the square area and
     * perimeter and prints them in the following format:
     * Square area = 4, Square perimeter = 8
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the square's side length in cm:");
        double x = input.nextDouble();

        double area = x * x;
        double perimeter = 4 * x;

        System.out.println("____________________________");
        System.out.println("Square's area = " + area + " cm2");
        System.out.println("Square's perimeter = " + perimeter+ " cm");
        System.out.println("____________________________");
    }
}
