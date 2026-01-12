package com.company.password.domain.rule;

public class DigitRule implements PasswordRule {

    @Override
    public boolean isValid(String password) {
        return password.chars().anyMatch(Character::isDigit);
    }

}
