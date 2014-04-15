package com.trex.app.TRexSoccer;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.trex.app.TRexSoccer.screens.Play;

public class TRexSoccerSeatingApp extends Game  {

    public TRexSoccerSeatingApp() {

    }
    String seatNo;
    public TRexSoccerSeatingApp(String seatNo) {
        this.seatNo = seatNo;
    }

    @Override
	public void create() {		
        setScreen(new Play(seatNo));
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void render() {		
		super.render();
	}

	@Override
	public void resize(int width, int height) {
        super.resize(width,height);
	}

	@Override
	public void pause() {
        super.pause();
	}

	@Override
	public void resume() {
	    super.resume();
    }
}
