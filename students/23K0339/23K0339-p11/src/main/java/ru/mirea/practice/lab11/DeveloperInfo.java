package ru.mirea.practice.lab11;

import java.util.Date;

public class DeveloperInfo {
    private final String developerName;
    private final Date startDate;
    private Date endDate;

    public DeveloperInfo(String developerName) {
        this.developerName = developerName;
        this.startDate = new Date();
    }

    public void completeAssignment() {
        this.endDate = new Date();
    }

    public void printInfo() {
        System.out.println("Разработчик: " + developerName);
        System.out.println("Дата получения задания: " + startDate);
        System.out.println("Дата сдачи задания: " + (endDate != null ? endDate : "Задание не сдано"));
    }

    public static void main(String[] args) {
        DeveloperInfo devInfo = new DeveloperInfo("Адамов");
        devInfo.completeAssignment();
        devInfo.printInfo();
    }
}

