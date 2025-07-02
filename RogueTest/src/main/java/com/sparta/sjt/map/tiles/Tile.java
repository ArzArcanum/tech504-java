package com.sparta.sjt.map.tiles;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Tile {
    protected int x, y;
    protected final BufferedImage sprite;
    protected final String name;
    protected boolean isSolid;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public BufferedImage getSprite() {
        return sprite;
    }

    public String getName() {
        return name;
    }

    public boolean isSolid() {
        return isSolid;
    }

    public Tile(int x, int y, BufferedImage sprite, String name, boolean solid) {
        this.x = x;
        this.y = y;
        this.sprite = sprite;
        this.name = name;
        this.isSolid = solid;
    }

    public void draw(Graphics g, int x, int y, int tileSize) {
        g.drawImage(sprite, x * tileSize, y * tileSize, null);
    }}
