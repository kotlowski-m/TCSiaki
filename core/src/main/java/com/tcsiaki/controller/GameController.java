package com.tcsiaki.controller;

import com.tcsiaki.model.GameWorld;

public class GameController {
    private GameWorld gameWorld;

    public GameController(GameWorld gameWorld) {
        this.gameWorld = gameWorld;
    }

    public void update(float deltaTime) {
        // Input handling will go here later
        gameWorld.update(deltaTime);
    }
}
