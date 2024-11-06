package ru.mirea.practice.s23k0823.task1.task1;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class PasswordCheck extends JFrame {
    private JTextField serviceGod;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public PasswordCheck() {
        super("Password appl");
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel serviceGodLabel = new JLabel("Service:");
        add(serviceGodLabel, gbc);

        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 1;
        gbc.gridy = 0;
        serviceGod = new JTextField(10);
        add(serviceGod, gbc);

        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel usernameLabel = new JLabel("Username:");
        add(usernameLabel, gbc);

        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 1;
        gbc.gridy = 1;
        usernameField = new JTextField(10);
        add(usernameField, gbc);

        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel passwordLabel = new JLabel("Password:");
        add(passwordLabel, gbc);

        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 1;
        gbc.gridy = 2;
        passwordField = new JPasswordField(10);
        add(passwordField, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        JButton submitButton = new JButton("Submit");
        add(submitButton, gbc);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String god = serviceGod.getText();
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (("Путь праведника труден, ибо препятствуют ему себялюбивые "
                        +
                        "и тирания злых людей. Блажен тот пастырь, кто во имя "
                        +
                        "милосердия и доброты ведет слабых за собой сквозь долину "
                        +
                        "тьмы, ибо именно он и есть тот самый, кто воистину печется "
                        +
                        "о ближних своих. И совершу над ними великое мщение наказаниями "
                        +
                        "яростными над теми, кто замыслит отравить и повредить братьям моим, "
                        +
                        "и узнаешь ты, что имя моё - Господь, когда мщение моё падёт на тебя.").equals(god)) {
                    JOptionPane.showMessageDialog(null, "Режисёр Квентин Тарантино представляет - <<Криминальное чтиво>>");
                } else {
                    if ("admin".equals(username) && "password".equals(password)) {
                        JOptionPane.showMessageDialog(null, "Login successful!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password.");
                    }
                }
            }
        });
        setSize(200, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        PasswordCheck passwordCheck = new PasswordCheck();
        passwordCheck.setVisible(true);
    }
}