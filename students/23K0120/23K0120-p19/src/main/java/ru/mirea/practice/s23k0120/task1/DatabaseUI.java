package ru.mirea.practice.s23k0120.task1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DatabaseUI {
    Database database;

    DatabaseUI() {
        database = new Database();
    }

    public String inputName(Scanner scanner) throws IllegalInputStringException {
        String name = scanner.nextLine();
        Pattern namePattern = Pattern.compile("[a-zA-Zа-яА-ЯёЁ]+ [a-zA-Zа-яА-ЯёЁ]+ [a-zA-Zа-яА-ЯёЁ]+");
        if (!namePattern.matcher(name).matches()) {
            throw new IllegalInputStringException("Name does not match pattern " + namePattern.pattern());
        }
        return name;
    }

    public String inputInn(Scanner scanner) throws IllegalInputStringException {
        String inn = scanner.nextLine();
        Pattern innPattern = Pattern.compile("\\d{12}");
        if (!innPattern.matcher(inn).matches()) {
            throw new IllegalInputStringException("INN does not match pattern " + innPattern.pattern());
        }

        return inn;
    }

    public void addClient(Scanner scanner) throws IllegalInputStringException {
        System.out.print("Enter client name: ");
        String name = inputName(scanner);
        System.out.print("Enter client INN: ");
        String inn = inputInn(scanner);
        database.addClient(name, inn);
    }

    public Client getClient(Scanner scanner) throws IllegalInputStringException {
        return database.getClient(inputInn(scanner));
    }
}
