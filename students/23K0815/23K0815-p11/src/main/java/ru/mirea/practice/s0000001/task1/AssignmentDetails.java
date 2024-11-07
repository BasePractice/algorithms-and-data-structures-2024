package ru.mirea.practice.s0000001.task1;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class AssignmentDetails {
    private static final Logger logger = Logger.getLogger(AssignmentDetails.class.getName());

    private AssignmentDetails() {
        throw new UnsupportedOperationException("Utility class should not be instantiated");
    }

    public static void main(String[] args) {
        String developerSurname = "Буров";

        Date dateReceived = new Date();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            logger.log(Level.SEVERE, "Thread was interrupted", e);
        }

        Date dateSubmitted = new Date();

        System.out.println("Фамилия разработчика: " + developerSurname);
        System.out.println("Дата и время получения задания: " + dateReceived);
        System.out.println("Дата и время сдачи задания: " + dateSubmitted);
    }
}