package pl.com.sda.rafal.zientara.javalon.week22.swing.zad2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FirstWindow {
    private JFrame frame;
    private JTextField textField;
    private JButton button;
    private JoinListener listener;

    public FirstWindow() {
        frame = new JFrame("£¹czator 1 - Joiner");
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setLayout(new BoxLayout(frame, BoxLayout.PAGE_AXIS));
//        frame.setLayout(null);
        frame.setLayout(new GridLayout(2,0));
        frame.setSize(300, 250);

        textField = new JTextField("tekst 1");
        textField.setBounds(50, 50, 200, 50);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        Font serif = new Font("serif", Font.BOLD, 32);
        textField.setFont(serif);
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                handleJoinClicked();
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        frame.add(textField);

        button = new JButton("Po³¹cz");
        button.setBounds(50, 150, 200, 50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleJoinClicked();
            }
        });
        frame.add(button);
    }

    private void handleJoinClicked() {
        if (listener != null) {
            listener.joinClicked(textField.getText());
        } else {
            System.out.println("Nikt mnie nie s³ucha ;(");
        }
    }

    public void show() {
        frame.setVisible(true);
    }

    public void setListener(JoinListener listener) {
        FirstWindow.this.listener = listener;
    }


}
