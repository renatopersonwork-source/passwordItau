package com.company.password.application;

import com.company.password.domain.rule.PasswordRule;
import java.util.List;

public class PasswordValidatorService {

    private final List<PasswordRule> rules;

    public PasswordValidatorService(List<PasswordRule> rules) {
        this.rules = rules;
    }

    public boolean isValid(String password) {
        if (password == null) {
            return false;
        }

        return rules.stream()
                .allMatch(rule -> rule.isValid(password));
    }
}