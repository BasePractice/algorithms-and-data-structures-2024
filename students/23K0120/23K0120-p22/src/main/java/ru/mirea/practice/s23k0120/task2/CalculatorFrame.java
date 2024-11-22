package ru.mirea.practice.s23k0120.task2;

import ru.mirea.practice.s23k0120.task1.CalculatorController;
import ru.mirea.practice.s23k0120.task1.ComputingElement;
import ru.mirea.practice.s23k0120.task1.utilclasses.Number;
import ru.mirea.practice.s23k0120.task1.utilclasses.OperationType;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CalculatorFrame extends JFrame {
    private final Map<String, JButton> buttons = new HashMap<>(12);
    private final CalculatorController controller;
    private String cachedNumber;
    private JTextField inputTextField;

    CalculatorFrame() {
        controller = new CalculatorController();
        cachedNumber = "";
        initComponents();
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponents() {
        String[] buttonNames = {"*", "/", "Backspace", "+", "-", "Clear", "7", "8", "9", "4", "5", "6",
            "1", "2", "3", "0", ".", "Enter"};

        for (String name : buttonNames) {
            buttons.put(name, new JButton(name));
            buttons.get(name).addActionListener(new ButtonActionListener());

        }

        setLayout(new GridLayout(2, 1, 1, 20));
        inputTextField = new JTextField(20);
        inputTextField.setText("");
        inputTextField.setFont(new Font("Calibri", Font.PLAIN, 30));
        inputTextField.setEditable(false);
        add(inputTextField);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(7, 3, 2, 2));
        for (String name : buttonNames) {
            buttonsPanel.add(buttons.get(name));
        }

        buttons.put("=", new JButton("="));
        buttons.get("=").addActionListener(new ButtonActionListener());

        buttonsPanel.add(new JLabel());
        buttonsPanel.add(buttons.get("="));
        buttonsPanel.add(new JLabel());

        add(buttonsPanel);
    }

    private void performButtonAction(String actionName) {
        switch (actionName) {
            case "backspace":
                delete();
                break;
            case "clear":
                clear();
                clearCache();
                break;
            case "+":
                addCached();
                controller.addOperation(OperationType.ADD);
                break;
            case "*":
                addCached();
                controller.addOperation(OperationType.MULTIPLY);
                break;
            case "-":
                addCached();
                controller.addOperation(OperationType.SUBTRACT);
                break;
            case "/":
                addCached();
                controller.addOperation(OperationType.DIVIDE);
                break;
            case "=":
                if (controller.getStackSize() > 0) {
                    controller.addNumber(controller.compute());
                }
                break;
            case ".":
                if (!cachedNumber.contains(".")) {
                    cachedNumber = cachedNumber.concat(actionName);
                }
                break;
            case "enter":
                if (!cachedNumber.isEmpty()) {
                    addCached();
                }
                if (controller.getStackSize() > 0) {
                    controller.addNumber(controller.compute());
                }
                break;
            default:
                cachedNumber = cachedNumber.concat(actionName);
                break;
        }
        inputTextField.setText(controller.toString() + cachedNumber);
    }

    private void addCached() {
        double cachedNumberDouble;
        try {
            cachedNumberDouble = Double.parseDouble(String.valueOf(cachedNumber));
            controller.addNumber(cachedNumberDouble);
            clearCache();
        } catch (NumberFormatException ignored) {
            return;
        }
    }

    private void clearCache() {
        cachedNumber = "";
    }

    private void delete() {
        if (!String.valueOf(cachedNumber).isEmpty()) {
            cachedNumber = cachedNumber.substring(0, cachedNumber.length() - 1);
        } else {
            ComputingElement element = controller.delete();
            if (element instanceof Number) {
                cachedNumber = Double.toString(((Number) element).getValue());
                cachedNumber = cachedNumber.substring(0, cachedNumber.length() - 1);
            }
        }
    }

    private void clear() {
        controller.clear();
    }

    class ButtonActionListener implements java.awt.event.ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String name = button.getText();
            performButtonAction(name.toLowerCase(Locale.US));
        }
    }
}
