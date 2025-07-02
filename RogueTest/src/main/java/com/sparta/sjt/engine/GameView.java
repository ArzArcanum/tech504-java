package com.sparta.sjt.engine;

import com.sparta.sjt.entities.Entity;

import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel {
    private final GameModel model;
    private final int width;
    private final int height;
    private final int tileSize;

    public GameView(GameModel model, int width, int height, int tileSize) {
        this.model = model;
        this.width = width;
        this.height = height;
        this.tileSize = tileSize;
        setPreferredSize(new Dimension(width * tileSize, height * tileSize));
        setBackground(Color.BLUE);
        setFocusable(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Entity entity = model.getEntityAt(x,y);
                // If an entity exists at this postion, draw it.
                if (entity != null) {
                    entity.draw(g,x,y,tileSize);
                }
                // Else, draw the tile
                else {
                    model.getTile(x,y).draw(g,x,y,tileSize);
                }
            }
//            System.out.println();
        }
    }
}
