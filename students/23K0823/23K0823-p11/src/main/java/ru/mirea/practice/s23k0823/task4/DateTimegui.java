package ru.mirea.practice.s23k0823.task4;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;

public class DateTimegui {
    private JFrame frame;
    private JTextField yearField;
    private JTextField monthField;
    private JTextField dayField;
    private JTextField hourField;
    private JTextField minuteField;

    public DateTimegui() {
        createGui();
    }

    private void createGui() {
        frame = new JFrame("Дата и Время");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel yearLabel = new JLabel("Год:");
        yearField = new JTextField(4);
        frame.add(yearLabel);
        frame.add(yearField);

        JLabel monthLabel = new JLabel("Месяц:");
        monthField = new JTextField(2);
        frame.add(monthLabel);
        frame.add(monthField);

        JLabel dayLabel = new JLabel("Число:");
        dayField = new JTextField(2);
        frame.add(dayLabel);
        frame.add(dayField);

        JLabel hourLabel = new JLabel("Часы:");
        hourField = new JTextField(2);
        frame.add(hourLabel);
        frame.add(hourField);

        JLabel minuteLabel = new JLabel("Минуты:");
        minuteField = new JTextField(2);
        frame.add(minuteLabel);
        frame.add(minuteField);

        JButton createButton = new JButton("Создать дату и время");
        createButton.addActionListener(new CreateButtonListener());
        frame.add(createButton);

        frame.pack();
        frame.setVisible(true);
    }

    private class CreateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int year = Integer.parseInt(yearField.getText());
            int month = Integer.parseInt(monthField.getText()) - 1;
            int day = Integer.parseInt(dayField.getText());
            int hour = Integer.parseInt(hourField.getText());
            int minute = Integer.parseInt(minuteField.getText());

            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month, day, hour, minute);

            Date date = calendar.getTime();

            JOptionPane.showMessageDialog(frame, "Дата и время созданы:\n" + date);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DateTimegui();
            }
        });
    }
}
