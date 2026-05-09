package com.tcsiaki.model;

/**
 * PURE JAVA MODEL. No LibGDX imports here!
 */
public class GameWorld {
    private Player player;
    private GameMap gameMap;

    public GameWorld() {
        this.player = new Player(new Position(0, 0));
        // 20 tiles wide, 15 tiles high, 32 pixels per tile (fits in 800x600)
        this.gameMap = new GameMap(20, 15, 32);
    }

    public Player getPlayer() {
        return player;
    }

    public GameMap getGameMap() {
        return gameMap;
    }

    public void update(float deltaTime) {
        // Logic updates go here
    }
}
