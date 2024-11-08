package ru.mirea.practice.s0000001;

import java.util.regex.Pattern;

class ExactStringValidator extends StringValidator {
    private static final String PATTERN = "^abcdefghijklmnopqrstuv18340$";

    public ExactStringValidator(String inputString) {
        super(inputString);
    }

    @Override
    public boolean isValid() {
        Pattern pattern = Pattern.compile(PATTERN);
        return pattern.matcher(inputString).matches();
    }
}
