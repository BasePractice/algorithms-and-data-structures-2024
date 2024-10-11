package ru.mirea.practice.s23L0908.Task12;

import java.io.File;

public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "Save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("Save", file);
        } else {
            throw new Exception(("Please open a file first."));
        }
    }
}
