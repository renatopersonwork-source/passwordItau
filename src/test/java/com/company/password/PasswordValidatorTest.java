package com.company.password;

import com.company.password.api.PasswordValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void shouldReturnTrueForValidPassword() {
        assertTrue(PasswordValidator.isValid("AbTp9!fok"));
    }

    @Test
    void shouldReturnFalseForInvalidPasswords() {
        assertFalse(PasswordValidator.isValid(""));
        assertFalse(PasswordValidator.isValid("aa"));
        assertFalse(PasswordValidator.isValid("ab"));
        assertFalse(PasswordValidator.isValid("AAAbbbCc"));
        assertFalse(PasswordValidator.isValid("AbTp9!foo"));
        assertFalse(PasswordValidator.isValid("AbTp9!foA"));
        assertFalse(PasswordValidator.isValid("AbTp9 fok"));
    }

    @Test
    void shouldReturnFalseWhenPasswordIsNull() {
        assertFalse(PasswordValidator.isValid(null));
    }
}