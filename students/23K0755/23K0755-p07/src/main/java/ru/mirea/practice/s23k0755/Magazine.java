package ru.mirea.practice.s23k0755;

class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                System.out.println(printable.getTitle());
            }
        }
    }
}
