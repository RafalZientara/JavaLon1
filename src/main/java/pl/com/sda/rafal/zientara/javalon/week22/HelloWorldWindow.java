package pl.com.sda.rafal.zientara.javalon.week22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldWindow {

    // .ico
    private JFrame frame;
    private JLabel label;
    private JButton button;

    public HelloWorldWindow() {
        frame = new JFrame("Naglowek");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(400, 300);

        label = new JLabel("Hello world!");
        label.setBounds(50, 50, 250, 100);
        frame.add(label);

        button = new JButton("Kliknij mnie!");
        button.setBounds(50, 150, 150, 50);
        ActionListener listener = e -> button.setText("Nie dotykaj mnie!");
        button.addActionListener(listener);
        frame.add(button);
        Font font = new Font("Serif", Font.PLAIN, 32);
        label.setFont(font);

        int lol = 0;
        String string = Integer.toString(lol);//konwersja
    }

    public void show() {
        frame.setVisible(true);
    }

}
