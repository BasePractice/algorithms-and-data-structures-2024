package ru.mirea.practice.s00000022.task2;

public class SimpleCalculatorController {
    private SimpleCalculatorModel model;
    private SimpleCalculatorView view;

    public SimpleCalculatorController(SimpleCalculatorModel model, SimpleCalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        view.setListener(new CalculatorListener() {
            @Override
            public void onButtonClicked(String text) {
                model.processButtonClick(text);
                view.setDisplay(model.getDisplayText());
            }

            @Override
            public void onClearClicked() {
                model.clear();
                view.setDisplay(model.getDisplayText());
            }

            @Override
            public void onEqualsClicked() {
                model.calculateResult();
                view.setDisplay(model.getDisplayText());
            }
        });
    }
}
