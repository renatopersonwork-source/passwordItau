package com.company.password.api;

import com.company.password.application.PasswordValidatorService;
import com.company.password.domain.rule.*;
import java.util.List;

public final class PasswordValidator {

    private static final PasswordValidatorService service =
            new PasswordValidatorService(List.of(
                    new MinLengthRule(),
                    new DigitRule(),
                    new LowercaseRule(),
                    new UppercaseRule(),
                    new SpecialCharRule(),
                    new NoRepeatedCharRule(),
                    new NoWhitespaceRule()
            ));

    private PasswordValidator() {
        // Evita instanciação
    }

    public static boolean isValid(String password) {
        return service.isValid(password);
    }
}