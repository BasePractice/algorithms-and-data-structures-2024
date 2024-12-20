package ru.mirea.practice.s23l0908.task4;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculatorModel extends JFrame implements ActionListener {
    private final JTextField tfResult;
    private double result = 0;
    private String operator = "=";
    private boolean click = true;

    private Panel panel;

    public CalculatorModel() {
        super("Calculator");
        setSize(400,500);
        setLayout(new BorderLayout());
        tfResult = new JTextField("0");
        tfResult.setEditable(false);
        add(tfResult,"North");
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4,4));
        String[] arr = {"7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"};
        for (String element : arr) {
            Button button = new Button(element);
            panel.add(button);
            button.addActionListener(this);
        }
        add(panel,"Center");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if ('0' <= s.charAt(0) && s.charAt(0) <= '9'
            || ".".equals(s)) {
            if (click) {
                tfResult.setText(s);
            } else {
                tfResult.setText(tfResult.getText() + s);
            }

            click = false;
        } else {
            if (click) {
                if ("-".equals(s)) {
                    tfResult.setText(s);
                    click = false;
                } else {
                    operator = s;
                }
            } else {
                double x = Double.parseDouble(tfResult.getText());
                calculator(x);
                operator = s;
                click = true;
            }
        }
    }

    public void calculator(double n) {
        if ("+".equals(operator)) {
            result += n;
        } else if ("-".equals(operator)) {
            result -= n;
        } else if ("*".equals(operator)) {
            result *= n;
        } else if ("/".equals(operator)) {
            result /= n;
        } else if ("=".equals(operator)) {
            result = n;
        }

        tfResult.setText(result + "");
    }

    public double getResult() {
        return result;
    }

    @SuppressWarnings("unused")
    public JTextField getTfResult() {
        return tfResult;
    }

    public String getOperator() {
        return operator;
    }

    @SuppressWarnings("unused")
    public boolean isClick() {
        return click;
    }

    @SuppressWarnings("unused")
    public void setClick(boolean click) {
        this.click = click;
    }

    @SuppressWarnings("unused")
    public void setTfResult(String text) {
        this.tfResult.setText(text);
    }

    @SuppressWarnings("unused")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @SuppressWarnings("unused")
    public Panel getPanel() {
        return panel;
    }

    @SuppressWarnings("unused")
    public void setPanel(Panel panel) {
        this.panel = panel;
    }
}
