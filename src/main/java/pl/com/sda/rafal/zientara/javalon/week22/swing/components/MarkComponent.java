package pl.com.sda.rafal.zientara.javalon.week22.swing.components;

import pl.com.sda.rafal.zientara.javalon.week2.homework.ticTacToe.TicTacToe;

import javax.swing.*;
import java.awt.*;

public class MarkComponent extends JButton {

    private int status = TicTacToe.FIELD_EMPTY;

    private static final int PADDING = 20;

    @Override
    public void paint(Graphics g) {
        int left = PADDING;
        int right = getWidth() - 2 * PADDING;
        int top = PADDING;
        int bottom = getHeight() - 2 * PADDING;

        int width = right - left;
        int height = bottom - top;

        int size = Math.min(width, height);

        g.setColor(Color.WHITE);
        g.fillRect(0,0,getWidth(), getHeight());
        g.setColor(Color.BLACK);
        g.drawRect(left, top, width, height);
        switch (getStatus()) {
            case TicTacToe.FIELD_O:
                g.drawOval(left, top, right - left, bottom - top);
                break;
            case TicTacToe.FIELD_X:
                g.drawLine(left, top, right, bottom);
                g.drawLine(left, bottom, right, top);
                break;
        }


    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
