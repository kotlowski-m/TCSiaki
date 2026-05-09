package com.tcsiaki.model;

/**
 * PURE JAVA MODEL. No LibGDX imports here!
 */
public class GameWorld {
    private Player player;

    public GameWorld() {
        this.player = new Player(new Position(0, 0));
    }

    public Player getPlayer() {
        return player;
    }

    public void update(float deltaTime) {
        // Logic updates go here
    }
}
