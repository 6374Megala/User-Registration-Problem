package com.user.registration.regex;

import java.util.Scanner;

public class User_Registration_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Password: ");
        String password = scanner.nextLine();
        if (isValidPassword(password)) {
            System.out.println("Valid Password : " + password);
        } else {
            System.out.println("Invalid Password. Please enter a valid Password.");
        }
    }
    private static boolean isValidPassword(String password) {
        return hasMinimumLength(password) && hasUpperCaseCharacter(password) && hasNumericCharacter(password) && hasSpecialCharacter(password);
    }
    private static boolean hasMinimumLength(String password) {
        return password.length() >= 8;
    }
    private static boolean hasUpperCaseCharacter(String password) {
        return password.matches(".*[A-Z].*");
    }
    private static boolean hasNumericCharacter(String password) {
        return password.matches(".*\\d.*");
    }
    private static boolean hasSpecialCharacter(String password) {
        return password.matches(".*\\W.*");
    }
}
