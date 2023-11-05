package Week2;

import java.util.Scanner;

public class _05NameAndPassword {
    /**
     *Write a program that has a default username and password in memory.
     * Then this program should request username from the user.
     * If the username is wrong program should print “Wrong username.” and end.
     * If the username is correct, program should request password.
     * If password is wrong program should print “Wrong password” and end.
     * If the password is correct program should print “You logged in successfully!” and end.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String realUsername = "Carol";
        String realPassword = "123456";

        System.out.print("Enter your username: ");
        String username = input.nextLine();

        if (!username.equals(realUsername)) {
            System.out.println("_____________________________");
            System.out.println("Wrong username!");
        } else {
            // request password from user
            System.out.println("_____________________________");
            System.out.print("Enter your password: ");
            String password = input.nextLine();

            if (password.equals(realPassword)) {
                System.out.println("_____________________________");
                System.out.println("You logged in successfully!");
            } else {
                System.out.println("_____________________________");
                System.out.println("Wrong password!");
            }
        }
    }
}
