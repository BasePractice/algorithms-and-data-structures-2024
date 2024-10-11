package ru.mirea.practice.s23L0908.Task12;

import java.util.EventListener;

public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed" + eventType + "operation with the following file" + file.getName());
    }
}
