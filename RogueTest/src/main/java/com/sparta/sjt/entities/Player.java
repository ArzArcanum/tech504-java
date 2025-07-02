package com.sparta.sjt.entities;

import java.awt.*;

public class Player extends Entity {
    public Player(int x, int y) {
        super(x, y, '@', "Hero");
    }

    @Override
    public void draw(Graphics g, int x, int y, int tileSize) {
        g.setColor(Color.YELLOW);
        g.fillRect(x * tileSize, y * tileSize, tileSize, tileSize);
    }
}
