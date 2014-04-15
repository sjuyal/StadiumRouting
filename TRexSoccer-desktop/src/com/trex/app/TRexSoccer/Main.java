package com.trex.app.TRexSoccer;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.useGL30=true;
		cfg.title = "TRexSoccerSeatingApp";
		cfg.width = 1024;
		cfg.height = 512;
		
		new LwjglApplication(new TRexSoccerSeatingApp(), cfg);
	}
}
