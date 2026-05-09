package com.tcsiaki.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.tcsiaki.model.GameMap;
import com.tcsiaki.model.GameWorld;

public class GameRenderer {
    private GameWorld gameWorld;
    private ShapeRenderer shapeRenderer;

    public GameRenderer(GameWorld gameWorld) {
        this.gameWorld = gameWorld;
        this.shapeRenderer = new ShapeRenderer();
    }

    public void render() {
        Gdx.gl.glClearColor(0.2f, 0.2f, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        GameMap map = gameWorld.getGameMap();
        int width = map.getWidthInTiles();
        int height = map.getHeightInTiles();
        int tileSize = map.getTileSize();

        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        shapeRenderer.setColor(0.5f, 0.5f, 0.5f, 1);

        // Draw vertical lines
        for (int x = 0; x <= width; x++) {
            shapeRenderer.line(x * tileSize, 0, x * tileSize, height * tileSize);
        }

        // Draw horizontal lines
        for (int y = 0; y <= height; y++) {
            shapeRenderer.line(0, y * tileSize, width * tileSize, y * tileSize);
        }

        shapeRenderer.end();
    }
    
    public void dispose() {
        if (shapeRenderer != null) {
            shapeRenderer.dispose();
        }
    }
}
