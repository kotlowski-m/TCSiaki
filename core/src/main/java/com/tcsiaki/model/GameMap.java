package com.tcsiaki.model;

/**
 * Represents the map dimensions and basic properties.
 * PURE JAVA MODEL. No LibGDX imports.
 */
public class GameMap {
    private final int widthInTiles;
    private final int heightInTiles;
    private final int tileSize;

    public GameMap(int widthInTiles, int heightInTiles, int tileSize) {
        this.widthInTiles = widthInTiles;
        this.heightInTiles = heightInTiles;
        this.tileSize = tileSize;
    }

    public int getWidthInTiles() {
        return widthInTiles;
    }

    public int getHeightInTiles() {
        return heightInTiles;
    }

    public int getTileSize() {
        return tileSize;
    }
}
