package ru.mirea.practice.s23l0908.task2;

import java.awt.Image;
import java.awt.Color;
import java.awt.Label;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class ImagesLoading implements ActionListener {
    JFrame fr = new JFrame("Image Loading Program using AWT");
    Label label1 = new Label("Choose your image");
    Button button1 = new Button("Select");
    Image image1;
    Imageload canvas1;
    FileDialog fd;

    void initialize() {
        fd = new FileDialog(fr, "Open", FileDialog.LOAD);
        fr.setSize(500, 500);
        fr.setLocation(200, 200);
        fr.setBackground(Color.LIGHT_GRAY);
        fr.setLayout(new FlowLayout());
        fr.add(label1);
        fr.add(button1);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1.addActionListener(this);

        canvas1 = new Imageload(null);
        canvas1.setSize(400, 400); // Set a reasonable size
        fr.add(canvas1);

        fr.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        fr.setVisible(true);
    }

    void imageload() {
        fd.setVisible(true);
        if (fd.getFile() == null) {
            label1.setText("You have not selected any file");
        } else {
            String d = fd.getDirectory() + fd.getFile();
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            image1 = toolkit.getImage(d);
            if (image1 != null) {
                canvas1.setImage(image1);
                canvas1.repaint();
            } else {
                label1.setText("Failed to load image");
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Button b = (Button) event.getSource();
        if (b.equals(button1)) {
            imageload();
        }
    }

    public static void main(String[] args) {
        ImagesLoading app = new ImagesLoading();
        app.initialize();
    }
}
