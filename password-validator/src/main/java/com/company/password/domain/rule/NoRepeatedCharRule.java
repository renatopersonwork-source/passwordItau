package com.company.password.domain.rule;

import java.util.HashSet;
import java.util.Set;

public class NoRepeatedCharRule implements PasswordRule {

    @Override
    public boolean isValid(String password) {
        Set<Character> seenCharacters = new HashSet<>();

        for (char c : password.toCharArray()) {
            if (!seenCharacters.add(c)) {
                return false;
            }
        }
        return true;
    }
}
