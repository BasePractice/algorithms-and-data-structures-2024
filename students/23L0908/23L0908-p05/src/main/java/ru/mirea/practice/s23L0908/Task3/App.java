package ru.mirea.practice.s23L0908.Task3;
import javax.swing.*;
import java.awt.*;
public class App extends JFrame {
    App(String filename){
        this.setTitle("Image");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //"files/example.jpg"
        ImageIcon image = new ImageIcon(filename);
        this.setSize(image.getIconWidth(), image.getIconHeight() + 50);
        this.setIconImage(image.getImage());
        JLabel display = new JLabel();
        display.setIcon(image);
        getContentPane().add(display, BorderLayout.CENTER);
    }
    public void run() {
        this.setResizable(false);
        this.setVisible(true);
    }
}
