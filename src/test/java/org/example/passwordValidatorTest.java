package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class passwordValidatorTest{
    @Test
    public void testPasswordLength() {
        // Test with a password of length 8
        assertTrue(passwordValidator.isValidPassword("abcdefgh"));

        // Test with a password of length 7
        assertFalse(passwordValidator.isValidPassword("abcdefg"));

        // Test with a password of length 9
        assertTrue(passwordValidator.isValidPassword("abcdefghi"));

        // Test with an empty password
        assertFalse(passwordValidator.isValidPassword(""));

    }
    @Test
    public void testPasswordContainsDigits() {
    // Test with a password containing digits
    assertTrue(passwordValidator.isValidPassword("Password123"));

    // Test with a password containing no digits
    assertFalse(passwordValidator.isValidPassword("Password"));

    // Test with an empty password
    assertFalse(passwordValidator.isValidPassword(""));
}

    @Test
    public void testPasswordContainsUppercaseAndLowercase() {
    // Test with a password containing both uppercase and lowercase letters
    assertTrue(passwordValidator.isValidPassword("Password123"));

    // Test with a password containing only lowercase letters
    assertFalse(passwordValidator.isValidPassword("password123"));

    // Test with a password containing only uppercase letters
    assertFalse(passwordValidator.isValidPassword("PASSWORD123"));

    // Test with an empty password
    assertFalse(passwordValidator.isValidPassword(""));
    }

    @Test
    public void testPasswordContainsWeakPasswords() {
        // Test with a weak password 'Password1'
        assertFalse(passwordValidator.isValidPassword("Password1"));

        // Test with a weak password 'Aa345678'
        assertFalse(passwordValidator.isValidPassword("Aa345678"));

        // Test with a strong password
        assertTrue(passwordValidator.isValidPassword("StrongPassword123"));

        // Test with an empty password
        assertFalse(passwordValidator.isValidPassword(""));
    }
}


