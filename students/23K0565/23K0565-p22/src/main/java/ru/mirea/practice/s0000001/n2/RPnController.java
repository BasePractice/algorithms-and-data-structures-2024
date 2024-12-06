package ru.mirea.practice.s0000001.n2;

public class RPnController {
    public RPnController(RPnModel model, RPnView view) {
        view.addCalculateListener(e -> {
            try {
                String input = view.getInput();
                int result = model.calculate(input);
                view.setResult(String.valueOf(result));
            } catch (Exception ex) {
                view.setResult("Ошибка: " + ex.getMessage());
            }
        });
    }
}
