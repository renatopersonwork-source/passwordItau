package com.company.password;

import com.company.password.domain.rule.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

class PasswordValidatorMyOwnDebugTest {

    private final List<PasswordRule> rules = List.of(
            new MinLengthRule(),
            new DigitRule(),
            new LowercaseRule(),
            new UppercaseRule(),
            new SpecialCharRule(),
            new NoRepeatedCharRule(),
            new NoWhitespaceRule()
    );

    @Test
    void debugPasswordValidation() {
        debug("AbTp9!fok");
        debug("AbTp9 fok");
        debug("AbTp9!foo");
        debug("AAAbbbCc");
        debug(null);
        debug("");
        debug("aa");

    }

    private void debug(String password) {
        System.out.println("====================================");
        System.out.println("Password: " + password);

        if (password == null) {
            System.out.println(" Password inválida: valor nulo");
            return;
        }

        for (PasswordRule rule : rules) {
            boolean result = rule.isValid(password);
            System.out.printf(
                    "%-30s : %s%n",
                    rule.getClass().getSimpleName(),
                    result ? "OK" : "FALHOU"
            );
        }
    }
}