package com.codegym.games.spaceinvaders;
import com.codegym.engine.cell.*;


public class SpaceInvadersGame extends Game {
    
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;

    private void createGame()
    {
        drawScene();
    }

    private void drawScene()
    {
        drawField();
    }

    private void drawField()
    {

    }
        
     @Override
        public void initialize()
        {
            setScreenSize(WIDTH, HEIGHT);
            createGame();
        }

    }
