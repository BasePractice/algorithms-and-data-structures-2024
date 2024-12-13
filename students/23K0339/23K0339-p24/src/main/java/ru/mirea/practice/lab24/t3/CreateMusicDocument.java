package ru.mirea.practice.lab24.t3;

public class CreateMusicDocument implements ICreateDocument {

    @Override
    public IDocument createNew() {
        return new MusicDocument();
    }

    @Override
    public IDocument createOpen() {
        // Реализуем логику открытия музыкального документа
        System.out.println("Открытие музыкального документа...");
        return new MusicDocument();
    }
}
