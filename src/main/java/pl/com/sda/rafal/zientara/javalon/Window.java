package pl.com.sda.rafal.zientara.javalon;

import pl.com.sda.rafal.zientara.javalon.week22.swing.components.FigureComponent;

import javax.swing.*;
import java.awt.*;

public class Window {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Woooow");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new GridLayout(1,1));
        frame.add(new FigureComponent());
        frame.setVisible(true);
    }
}
