package com.sparta.sjt.map.tiles;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Wall extends Tile {

    public Wall(int x, int y, BufferedImage sprite) {
        super(x, y,  sprite, "Stone Wall", true);
    }

}
