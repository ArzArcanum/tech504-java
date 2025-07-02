package com.sparta.sjt.engine;

import com.sparta.sjt.entities.Entity;
import com.sparta.sjt.entities.Player;
import com.sparta.sjt.map.TileSet;
import com.sparta.sjt.map.tiles.Floor;
import com.sparta.sjt.map.tiles.Wall;
import com.sparta.sjt.map.tiles.Tile;

import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import java.awt.*;

// This class is responsible for:
//  Drawing the current state of the world
//  Forwarding events to the game logic controller
public class GameModel {
    private final int width;
    private final int height;
    private final int tileSize;

    private TileSet tileSet;

    private Tile[][] map;
    private final List<Entity> entities = new ArrayList<>();

    public GameModel(int width, int height, int tileSize) {
        this.width = width;
        this.height = height;
        this.tileSize = tileSize;

        tileSet = new TileSet();
        map = new Tile[width][height];

        initMap();    }

    private void initMap() {
        for  (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Add Border Walls
                if (x == 0 || y == 0 || x == width - 1 || y == height - 1) {
                    map[x][y] = new Wall(x,y, tileSet.wallSprite);
                }
                else {
                    map[x][y] = new Floor(x,y, tileSet.floorSprite);
                }
            }
        }
        entities.add(new Player(1,1));
    }

    public Tile getTile(int x, int y) {
        return map[x][y];
    }

    public Entity getEntityAt(int x, int y) {
        for (Entity entity : entities) {
            if (entity.getX() == x && entity.getY() == y) {
                return entity;
            }
        }
        return null;
    }

    public Player getPlayer() {
        for (Entity entity: entities) {
            if (entity instanceof Player) {
                return (Player) entity;
            }
        }
        return null;
    }

    public boolean isOutOfBounds(int x, int y) {
        if (x < 0 || y < 0 || x >= width || y >= height) {
            return true;
        }
        return false;
    }

    public boolean movePlayer(int newX, int newY) {
        Player player = getPlayer();
        if (isOutOfBounds(newX, newY)) {
            return false;
        }

        Tile destinationTile = map[newX][newY];

        // If space isn't blocked by wall
        if (!destinationTile.isSolid()) {
            player.setX(newX);
            player.setY(newY);
            return true;
        } else {
            return false;
        }
    }
}
