package ru.mirea.practice.pr2;

public abstract class TestWriter {
    public static void main(String[] args) {
        Writer writer = new Writer("Jane Gane", "jane.gane@example.com", 'F');

        System.out.println("Полное имя автора: " + writer.getFullName());
        System.out.println("Контактный email автора: " + writer.getContactEmail());
        System.out.println("Пол автора: " + writer.getWriterGender());

        writer.setContactEmail("jane.newemail@example.com");
        System.out.println("Обновленный email автора: " + writer.getContactEmail());

        System.out.println(writer.toString());
    }
}
