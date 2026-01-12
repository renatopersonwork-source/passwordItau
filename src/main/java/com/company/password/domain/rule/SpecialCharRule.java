package com.company.password.domain.rule;

public class SpecialCharRule implements PasswordRule {

    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-+";

    @Override
    public boolean isValid(String password) {
        return password.chars()
                .anyMatch(c -> SPECIAL_CHARACTERS.indexOf(c) >= 0);
    }
}