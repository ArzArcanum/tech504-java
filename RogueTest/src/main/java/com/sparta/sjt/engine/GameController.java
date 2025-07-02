package com.sparta.sjt.engine;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameController extends KeyAdapter {
    private final GameModel model;
    private final GameView view;

    public GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int newX = model.getPlayer().getX();
        int newY = model.getPlayer().getY();

        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> newY--;
            case KeyEvent.VK_S -> newY++;
            case KeyEvent.VK_A -> newX--;
            case KeyEvent.VK_D -> newX++;
        }
        model.movePlayer(newX, newY);
        view.repaint();
    }
}
