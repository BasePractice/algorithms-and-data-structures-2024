package ru.mirea.practice.s23L0908.prog13;

public abstract class Main {
    public static void main(String[] args) {
        ObservableStringBuilder obs = new ObservableStringBuilder();

        StringBuilder sb = new StringBuilder("Hello ");

        ConsoleObserver observer = new ConsoleObserver(); // Создаем наблюдателя
        obs.addObserver(observer); // Добавляем наблюдателя

        obs.append(sb, "world!"); // Добавление текста, оповещаем наблюдателя
        obs.append(sb, "  and "); // Добавление текста, оповещаем наблюдателя

        System.out.println(obs.print(sb)); // Вывод: Hello, world!  and

        obs.removeObserver(observer); // Удаляем наблюдателя
        obs.append(sb, "more text"); // Добавление текста, наблюдатель не оповещается
        System.out.println(obs.print(sb)); // Вывод: Hello, world!  and more text
    }
}
