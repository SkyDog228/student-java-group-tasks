package com.classroom.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task2PasswordStrengthCheckerTest {

    @Test
    void detectsDigits() {
        assertTrue(Task2PasswordStrengthChecker.hasDigit("Java2026"));
        assertTrue(Task2PasswordStrengthChecker.hasDigit("abc1"));
        assertFalse(Task2PasswordStrengthChecker.hasDigit("JavaCode"));
    }

    @Test
    void checksLengthAtLeastEight() {
        assertTrue(Task2PasswordStrengthChecker.isLongEnough("Java2026"));
        assertTrue(Task2PasswordStrengthChecker.isLongEnough("12345678"));
        assertFalse(Task2PasswordStrengthChecker.isLongEnough("Short1"));
    }

    @Test
    void checksNoSpaces() {
        assertTrue(Task2PasswordStrengthChecker.hasNoSpaces("Java2026"));
        assertFalse(Task2PasswordStrengthChecker.hasNoSpaces("Java 2026"));
        assertFalse(Task2PasswordStrengthChecker.hasNoSpaces(" Java2026"));
    }
}
