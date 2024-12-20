package ru.mirea.practice.s0000001;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SecurePasswordValidator extends PasswordValidator {
    private static final String PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d_]{8,}$";

    public SecurePasswordValidator(String password) {
        super(password);
    }

    @Override
    public boolean isValid() {
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
