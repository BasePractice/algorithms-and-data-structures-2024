package ru.mirea.practice.s23l0908.task6789;

@SuppressWarnings("unused")
public class Shop implements Printable {
    private String name;
    private int taxcode;

    Shop(String name, int taxcode) {
        this.name = name;
        this.taxcode = taxcode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNane(String name) {
        return name;
    }

    public void setTaxcode(int taxcode) {
        this.taxcode = taxcode;
    }

    public int getTaxCode(int taxCode) {
        return taxCode;
    }

    public void print() {
        System.out.println("This shop is called " + this.name + "  and has a tax code of " + this.taxcode);
    }
}
