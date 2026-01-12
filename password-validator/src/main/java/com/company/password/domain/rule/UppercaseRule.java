package com.company.password.domain.rule;

public class UppercaseRule implements PasswordRule {

    @Override
    public boolean isValid(String password) {
        return password.chars().anyMatch(Character::isUpperCase);
    }
}