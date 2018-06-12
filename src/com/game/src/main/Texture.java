package com.game.src.main;

import java.awt.image.BufferedImage;

public class Texture {
	
	public BufferedImage player, missile, enemy,Boss;
	
	private SpriteSheet ss;
	private SpriteSheet bb;
	
	
	public Texture(Game game) {
		 ss = new SpriteSheet(game.getSpriteSheet());
		 bb = new SpriteSheet(game.getBoss());
		
		getTextures();
	}
	
	
	private void getTextures() {
		player = ss.grabImage(1, 1, 32, 32);
		missile = ss.grabImage(2, 1, 32, 32);
		enemy = ss.grabImage(3, 1, 32, 32);
		Boss = bb.grabBoss(0, 0, 600, 400);
		
	}

}
