package ru.mirea.practice.s23l0908.outputline.task3;

public final class Tester {
    private Tester() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        Agency agency = new Agency("Raiffensen");

        agency.addEmployees("ABC", 0);
        agency.addEmployees("DEF", 250_000);
        agency.addEmployees("XYZ", 100_000);

        Report.generateReport(agency);
    }
}

