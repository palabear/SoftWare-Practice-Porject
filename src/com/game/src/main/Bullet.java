package com.game.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.src.main.classes.EntityA;

public class Bullet extends GameObject implements EntityA {
	
	
	private Texture tex;
	private Game game;
	
	
	public Bullet(double x, double y, Texture tex, Game game) {
		super(x,y);
		this.tex = tex;		
		this.game = game;
	}
	
	public void tick() {
		y -= 10;		
		
	}
	
	public void render(Graphics g) {		
		g.drawImage(tex.missile, (int) x,(int) y, null);
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x,(int)y,32,32);
	}
	
	public double getY() {
		return y;
	}
	
	public double getX() {
		return x;
	}
	

}
