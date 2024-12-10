package mirea.lab24.p2;

public class Client {
    private Chair ch;

    public void setChair(Chair ch) {
        this.ch = ch;
    }

    public void sit() {
        if (ch == null) {
            System.out.println("Нет стула");
        } else {
            ch.sit();
        }
    }
}
