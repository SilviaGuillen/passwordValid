package org.example;

import java.util.HashSet;

public class passwordValidator {

    // Method to check if a password meets various criteria
    public static boolean isValidPassword(String password) {
        // Check if password is at least 8 characters long
        if (password.length() < 8) {
            return false;
        }
        // Check if password contains at least one digit
        boolean containsDigit = false;
        // Check if password contains at least one uppercase letter
        boolean containsUppercase = false;
        // Check if password contains at least one lowercase letter
        boolean containsLowercase = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                containsDigit = true;
            } else if (Character.isUpperCase(c)) {
                containsUppercase = true;
            } else if (Character.isLowerCase(c)) {
                containsLowercase = true;
            }

            // If all criteria are met, return true
            if (containsDigit && containsUppercase && containsLowercase) {
                return true;
            }
        }

        return false;
    }

    // Method to detect commonly used passwords
    public static boolean isCommonPassword(String password) {
        // List of commonly used passwords
        HashSet<String> commonPasswords = new HashSet<>();
        commonPasswords.add("password");
        commonPasswords.add("123456");
        // Add more common passwords as needed

        return commonPasswords.contains(password);
    }

    public static boolean containsWeakPasswords(String password) {
        String[] weakPasswords = {"Password1", "Aa345678"};

        for (String weakPassword : weakPasswords)
            if (password.equals(weakPassword)) {
                return true;
            }


        return false;
    }


    public static void main(String[] args) {
        String password = "MySecurePassword123";

        if (!isValidPassword(password)) {
            System.out.println("Password is invalid. It must be at least 8 characters long and contain digits, uppercase, and lowercase letters.");
        } else if (isCommonPassword(password)) {
            System.out.println("Password is weak. Please choose a stronger one.");
        } else {
            System.out.println("Password is valid.");
        }
    }

}













