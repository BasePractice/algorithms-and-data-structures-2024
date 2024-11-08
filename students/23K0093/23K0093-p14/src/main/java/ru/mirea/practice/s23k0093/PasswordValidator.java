package ru.mirea.practice.s23k0093;

public abstract class PasswordValidator {
    public static void main(String[] args) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d_]{8,}$";

        String[] passwords = {
            "F032_Password", // правильный
            "TrySpy1",       // правильный
            "smart_pass",    // неправильный
            "A007"           // неправильный
        };

        for (String password : passwords) {
            if (password.matches(regex)) {
                System.out.println(password + " -> Надёжный пароль");
            } else {
                System.out.println(password + " -> Ненадёжный пароль");
            }
        }
    }
}
