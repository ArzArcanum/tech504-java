package com.sparta.sjt.entities;

import java.awt.*;

public abstract class Entity {
    protected int x, y;
    protected final char symbol;
    protected final String name;
    protected boolean isAlive;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getSymbol() {
        return symbol;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public String getName() {
        return name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Entity(int x, int y, char symbol, String name) {
        this.x = x;
        this.y = y;
        this.symbol = symbol;
        this.name = name;
        this.isAlive = true;
    }

    public abstract void draw(Graphics g, int x, int y, int tileSize);

}
