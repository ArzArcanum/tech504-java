package com.sparta.sjt.map.tiles;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Floor extends Tile{

    public Floor(int x, int y, BufferedImage sprite) {
        super(x, y, sprite, "Stone Floor", false);
    }
}
