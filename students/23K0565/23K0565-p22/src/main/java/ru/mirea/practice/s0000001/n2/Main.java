package ru.mirea.practice.s0000001.n2;

public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        RPnModel model = new RPnModel();
        RPnView view = new RPnView();
        new RPnController(model, view);

        view.setVisible(true);
    }
}
