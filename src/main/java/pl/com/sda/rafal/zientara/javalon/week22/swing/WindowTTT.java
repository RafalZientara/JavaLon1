package pl.com.sda.rafal.zientara.javalon.week22.swing;

import pl.com.sda.rafal.zientara.javalon.week2.homework.ticTacToe.GameResult;
import pl.com.sda.rafal.zientara.javalon.week2.homework.ticTacToe.TicTacToe;
import pl.com.sda.rafal.zientara.javalon.week22.swing.components.MarkComponent;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class WindowTTT {
    private JFrame frame;
    private MarkComponent[] buttons = new MarkComponent[9];
    private TicTacToe game = new TicTacToe();

    public WindowTTT() {
        frame = new JFrame("TTT");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new GridLayout(3, 3));

        Font font = new Font("arial", Font.BOLD, 32);
        for (int i = 0; i < 9; i++) {
            MarkComponent button = new MarkComponent();
            button.setHorizontalAlignment(SwingConstants.CENTER);
            button.setVerticalAlignment(SwingConstants.CENTER);
            button.setFont(font);
            int finalI = i;
            button.addActionListener(e -> handleElementClicked(finalI));
            frame.add(button);
            buttons[i] = button;
        }
        refreshTitle();
    }

    private void handleElementClicked(int elementId) { // 0-8
        handleElementChange(elementId);
        handleComputerMove();
    }

    private void handleElementChange(int elementId) { // 0-8
        int row = elementId / 3;
        int col = elementId % 3;
        game.addMark(row, col);
        refreshButton(buttons[elementId]);
        refreshTitle();
        checkResult();
    }

    private void handleComputerMove() {
        Random random = new Random();
        boolean isMoveDone = false;
        while (!isMoveDone) {
            int itemId = random.nextInt(9);
            int row = itemId / 3;
            int col = itemId % 3;
            if (game.getFieldStatus(row, col) == TicTacToe.FIELD_EMPTY) {
                handleElementChange(itemId);
                isMoveDone = true;
            }
        }
    }

    private void refreshButton(MarkComponent button) {
        button.setStatus(game.isPlayerXTurn() ? TicTacToe.FIELD_O : TicTacToe.FIELD_X);
//        button.setText(game.isPlayerXTurn() ? "O" : "X");
        button.setEnabled(false);
    }

    private void checkResult() {
        GameResult result = game.getResult();
        switch (result) {
            case PLAYER_O_WIN:
                disableAllButtons();
                showDialog("Player O win!", "win.jpg");
                break;
            case PLAYER_X_WIN:
                disableAllButtons();
                showDialog("Player X win!", "win.jpg");
                break;
            case DRAW:
                disableAllButtons();
                showDialog("Draw!", "tie.jpg");
                break;
        }
    }

    private void disableAllButtons() {
        for (JButton button : buttons) {
            button.setEnabled(false);
        }
    }

    private void showDialog(String title, String imagePath) {
        JDialog dialog = new JDialog(frame, true);
        dialog.setSize(400, 400);
        dialog.setLocationRelativeTo(frame);
        dialog.setTitle(title);
        try {
//            String path = "C:\\Users\\rafal.zientara\\Documents\\JavaLon1\\tie.jpg";
            String path = imagePath;//;
            File file = new File(path);
            BufferedImage myPicture = ImageIO.read(file);
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            dialog.add(picLabel);
        } catch (IOException e) {
            e.printStackTrace();
        }
        dialog.setVisible(true);
    }

    private void refreshTitle() {
        if (game.isPlayerXTurn()) {
            frame.setTitle("X turn");
        } else {
            frame.setTitle("O turn");
        }
    }

    public void show() {
        frame.setVisible(true);
    }
}
