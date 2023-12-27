package com.user.registration.regex;

import java.util.Scanner;

public class User_Registration_UC1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your First Name: ");
        String firstName = scanner.nextLine();
        boolean isValid=firstName.matches("[A-Z]{1}[a-zA-Z]{2,}");
        if(isValid){
            System.out.println("Valid First Name: " + firstName);
        }
        else{
            System.out.println("Invalid First Name. Please enter a valid First Name.");
        }
    }
}
