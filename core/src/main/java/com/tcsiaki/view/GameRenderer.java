package com.tcsiaki.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.tcsiaki.model.GameWorld;

public class GameRenderer {
    private GameWorld gameWorld;

    public GameRenderer(GameWorld gameWorld) {
        this.gameWorld = gameWorld;
    }

    public void render() {
        Gdx.gl.glClearColor(0.2f, 0.2f, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        // Rendering logic will go here
    }
    
    public void dispose() {
        // Dispose resources here
    }
}
