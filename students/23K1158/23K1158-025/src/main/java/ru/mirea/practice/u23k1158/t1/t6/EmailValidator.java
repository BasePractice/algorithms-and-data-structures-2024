package ru.mirea.practice.u23k1158.t1.t6;

public abstract class EmailValidator {
    public static void main(String[] args) {
        String[] emails = {
            "user@example.com",
            "user@sub.example.ru",
            "user@com"
        };
        for (String email : emails) {
            System.out.println(email + " is " + (isValidEmail(email) ? "Valid" : "Invalid"));
        }
    }
    public static boolean isValidEmail(String email) {
        // Регулярное выражение для проверки e-mail адреса
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }
}
