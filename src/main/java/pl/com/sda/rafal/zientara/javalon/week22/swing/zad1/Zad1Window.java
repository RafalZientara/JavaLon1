package pl.com.sda.rafal.zientara.javalon.week22.swing.zad1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zad1Window {
    private JFrame frame;
    private JLabel label;
    private JButton button;
    private int clickCount = 0;

    public Zad1Window() {
        frame = new JFrame("Zliczatotron");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300, 250);

        label = new JLabel("0");
        label.setBounds(50, 50, 200, 50);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        Font serif = new Font("serif", Font.BOLD, 32);
        label.setFont(serif);
        frame.add(label);

        button = new JButton("Wincyj!");
        button.setBounds(50, 150, 200, 50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                label.setText(String.valueOf(clickCount));
            }
        });
        frame.add(button);
    }

    public void show() {
        frame.setVisible(true);
    }

}
