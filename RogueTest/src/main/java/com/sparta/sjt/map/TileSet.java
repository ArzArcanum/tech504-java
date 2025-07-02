package com.sparta.sjt.map;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TileSet {
    private BufferedImage tileSet;
    private final int tileSize = 32;
    private BufferedImage[][] tiles;

    public BufferedImage wallSprite;
    public BufferedImage floorSprite;

    public TileSet() {
        try {
            // Get the tileset image
            tileSet = ImageIO.read(getClass().getResource("/tiles.png"));

            int rows =  tileSet.getHeight() / tileSize;
            int cols = tileSet.getWidth() / tileSize;
            tiles = new BufferedImage[rows][cols];

            // Extract individual tiles
            for(int row = 0; row < rows; row++) {
                for(int col = 0; col < cols; col++) {
                    tiles[row][col] = tileSet.getSubimage(
                            col * tileSize, row * tileSize, tileSize, tileSize
                    );
                }
            }

            floorSprite = tiles[9][2];
            wallSprite = tiles[2][0];

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public BufferedImage getTile(int row, int col) {
        return tiles[row][col];
    }
}
