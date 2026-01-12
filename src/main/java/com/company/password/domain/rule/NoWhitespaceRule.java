package com.company.password.domain.rule;

public class NoWhitespaceRule implements PasswordRule {

    @Override
    public boolean isValid(String password) {
        return password.chars().noneMatch(Character::isWhitespace);
    }
}