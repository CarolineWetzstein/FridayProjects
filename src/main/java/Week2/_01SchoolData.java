package Week2;

import java.util.Scanner;

public class _01SchoolData {
    /**
     * Create a program that asks a student to enter their first name, last name, student ID, grade and GPA. At the end,
     * the program should display the result in the following format:
     * Name = John
     * Surname = Doe
     * Student ID = 13568
     * Grade = 3
     * GPA = 3.45
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.next();

        System.out.println("Enter your surname:");
        String surName = input.next();

        System.out.println("Enter your student ID number:");
        int studentID = input.nextInt();

        System.out.println("Enter your grade:");
        int grade = input.nextInt();

        System.out.println("Enter your GPA");
        double GPA = input.nextDouble();

        System.out.println("************************");
        System.out.println("name = " + name);
        System.out.println("surName = " + surName);
        System.out.println("studentID = " + studentID);
        System.out.println("grade = " + grade);
        System.out.println("GPA = " + GPA);
        System.out.println("************************");
    }
}

// Define limits for GPA, grade and ID
// Grade 0-10
// GPA
//ID only 5 numbers