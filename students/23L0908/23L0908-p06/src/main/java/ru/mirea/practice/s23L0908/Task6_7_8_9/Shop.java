package ru.mirea.practice.s23L0908.Task6_7_8_9;

public class Shop implements Printable {
    private String name;
    private int taxCode;

    Shop(String name, int taxCode) {
        this.name = name;
        this.taxCode = taxCode;
    }

    public void setName() {
        this.name = name;
    }

    public String getNane(String name) {
        return name;
    }

    public void setTaxCode() {
        this.taxCode = taxCode;
    }

    public int getTaxCode(int taxCode) {
        return taxCode;
    }

    public void print() {
        System.out.println("This shop is called " + this.name + "  and has a tax code of " + this.taxCode);
    }
}
