package com.user.registration.regex;

import java.util.Scanner;

public class User_Registration_UC4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Mobile Number: ");
        String mobile = scanner.nextLine();
        if (isValidMobileNumber(mobile)) {
            System.out.println("Valid Mobile Number: " + mobile);
        } else {
            System.out.println("Invalid Mobile Number. Please enter a valid Mobile Number.");
        }
    }
    private static boolean isValidMobileNumber(String mobile) {
        return mobile.matches("(91){1}\\s+[6-9][0-9]{9}");
    }
}
