package com.sparta.sjt;

import com.sparta.sjt.engine.GameController;
import com.sparta.sjt.engine.GameModel;
import com.sparta.sjt.engine.GameView;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            GameModel model = new GameModel(10, 10, 32);
            GameView view = new GameView(model, 10, 10, 32);
            GameController controller = new GameController(model, view);

            view.addKeyListener(controller);

            JFrame frame = new JFrame("Rogue-Like");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.add(view);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            view.requestFocusInWindow();
        });
    }
}