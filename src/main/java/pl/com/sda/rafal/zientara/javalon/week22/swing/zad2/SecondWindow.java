package pl.com.sda.rafal.zientara.javalon.week22.swing.zad2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondWindow implements JoinListener {
    private JFrame frame;
    private JTextField textField;
    private JLabel label;

    public SecondWindow() {
        frame = new JFrame("£¹czator 2");
        frame.setLocation(600, 100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300, 250);

        textField = new JTextField("tekst 2");
        textField.setBounds(50, 50, 200, 50);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        Font serif = new Font("serif", Font.BOLD, 32);
        textField.setFont(serif);
        frame.add(textField);

        label = new JLabel("t1+t2");
        label.setBounds(50, 150, 200, 50);
        frame.add(label);
    }

    public void show() {
        frame.setVisible(true);
    }

    @Override
    public void joinClicked(String text) {
        String text1 = text;
        String text2 = textField.getText();

        label.setText(text1 + text2);
    }
}
