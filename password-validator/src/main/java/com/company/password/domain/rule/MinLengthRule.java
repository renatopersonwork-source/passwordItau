package com.company.password.domain.rule;

public class MinLengthRule implements PasswordRule {

    private static final int MIN_LENGTH = 9;

    @Override
    public boolean isValid(String password) {
        return password.length() >= MIN_LENGTH;
    }
}
