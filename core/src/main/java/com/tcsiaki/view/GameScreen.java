package com.tcsiaki.view;

import com.badlogic.gdx.ScreenAdapter;
import com.tcsiaki.controller.GameController;
import com.tcsiaki.model.GameWorld;

public class GameScreen extends ScreenAdapter {
    private GameWorld gameWorld;
    private GameController controller;
    private GameRenderer renderer;

    public GameScreen() {
        this.gameWorld = new GameWorld();
        this.controller = new GameController(gameWorld);
        this.renderer = new GameRenderer(gameWorld);
    }

    @Override
    public void render(float delta) {
        controller.update(delta);
        renderer.render();
    }

    @Override
    public void dispose() {
        renderer.dispose();
    }
}
