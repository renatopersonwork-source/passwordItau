package com.company.password.domain.rule;

public class LowercaseRule implements PasswordRule {

    @Override
    public boolean isValid(String password) {
        return password.chars().anyMatch(Character::isLowerCase);
    }
}
