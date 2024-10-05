package ru.mirea.practice.s23L0908.output_line.task3;

public class Tester {
    public static void main(String[] args) {
        Agency agency = new Agency("Raiffensen");
        agency.addEmloyees("ABC", 0);
        agency.addEmloyees("DEF", 250_000);
        agency.addEmloyees("XYZ", 100_000);
        Report.generateReport(agency);
    }
}
