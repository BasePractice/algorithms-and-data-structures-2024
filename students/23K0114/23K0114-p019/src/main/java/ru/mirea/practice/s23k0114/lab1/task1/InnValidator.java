package ru.mirea.practice.s23k0114.lab1.task1;

// Класс для проверки ИНН
final class InnValidator {
    // Приватный конструктор для предотвращения создания экземпляров
    private InnValidator() {}

    public static void validateInn(String inn) throws InvalidInnException {
        // Проверка на 10 или 12 цифр
        if (inn == null || !inn.matches("\\d{10}") && !inn.matches("\\d{12}")) {
            throw new InvalidInnException("Недействительный ИНН: " + inn);
        }
    }
}
