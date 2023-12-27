package com.user.registration.regex;

import java.util.Scanner;

public class User_Registration_UC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your First Name: ");
        String firstName = scanner.nextLine();
        if(isValidFirstLastName(firstName)){
            System.out.println("Valid First Name: " + firstName);
        }
        else{
            System.out.println("Invalid First Name. Please enter a valid First Name.");
        }
        System.out.println("Enter your Last Name: ");
        String lastName = scanner.nextLine();
        if(isValidFirstLastName(lastName)){
            System.out.println("Valid Last Name: " + lastName);
        }
        else{
            System.out.println("Invalid Last Name. Please enter a valid Last Name.");
        }
    }
    private static boolean isValidFirstLastName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]{2,}");
    }


}
