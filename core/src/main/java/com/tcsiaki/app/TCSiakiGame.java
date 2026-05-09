package com.tcsiaki.app;

import com.badlogic.gdx.Game;
import com.tcsiaki.view.GameScreen;

public class TCSiakiGame extends Game {
    @Override
    public void create() {
        setScreen(new GameScreen());
    }
}
