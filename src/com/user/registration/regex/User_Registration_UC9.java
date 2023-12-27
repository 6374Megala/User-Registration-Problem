package com.user.registration.regex;

import java.util.Scanner;

public class User_Registration_UC9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Email: ");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Valid Email: " + email);
        } else {
            System.out.println("Invalid Email. Please enter a valid Email.");
        }

    }
    private static boolean isValidEmail(String email) {
        return email.matches("[a-zA-Z]+(\\w)*((\\-|\\+|\\.)\\w+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})?(\\.[a-zA-Z]{2,})");
    }
}
