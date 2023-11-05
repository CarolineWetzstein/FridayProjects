package Week2;

import java.util.Scanner;

public class _04BMICalculator {
    /**
     * Create a program that requests height and weight of a user and calculates and prints the BMI
     * in the following format:
     * Output:
     * Your Body Mass Index is XXX.
     * Hint = BMI=Weight/(Height*Height)
     * And after that if:
     * BMI is less than 18.5, program prints “You are in the underweight range of BMI scale.”
     * BMI is 18.5 to 24.9, program prints “You are in the healthy range of BMI scale”.
     * BMI is 25.0 to 29.9, program prints “You are in the overweight range of BMI scale.”
     * BMI is 30.0 or higher, program prints “You are in the obese range of BMI scale.”
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your height in meter:");
        double height = input.nextDouble();
        System.out.println("Enter your weight in kilogram:");
        double weight = input.nextDouble();
        double BMI = weight / (height * height);

        System.out.println("_____________________________");
        System.out.println("Your BMI is " + BMI);

        if (BMI < 18.5) {
            System.out.println("BMI indicates UNDERWEIGHT");
        } else if (BMI > 18.5 && BMI < 24.9) {
            System.out.println("BMI indicates NORMAL WEIGHT");
        } else if (BMI > 25 && BMI < 29.9) {
            System.out.println("BMI indicates OVERWEIGHT");
        } else {
            System.out.println("BMI indicates OBESITY");
        }
        System.out.println("_____________________________");
    }
}
