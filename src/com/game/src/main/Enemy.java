package com.game.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import com.game.src.main.classes.EntityB;

public class Enemy extends GameObject implements EntityB {
	
	
	Random r =new Random();
	
	private int speed = r.nextInt(3) + 1; 
	
	private Texture tex;
	private Game game;
	private Controller c;
	private Wallet w;
	
	
	public Enemy(double x, double y, Texture tex,Controller c, Game game,Wallet w) {
	    super(x,y);
		this.tex = tex;
		this.c = c;
		this.game = game;
		this.w=w;
		
	}
	
	public void tick() {
		y+=speed;	
		
		if(y>(Game.HEIGHT * Game.SCALE)) {
			y= -10;
			x = r.nextInt(Game.WIDTH * Game.SCALE);
			
		}
		
		if(Physics.Collision(this, game.ea)) {
			
			c.removeEntity(this);
			w.set_Money(w.AmountMoney() + 1);
			game.setEnemy_killed(game.getEnemy_killed() + 1);
			
		}
		
	}
	
	public void render(Graphics g) {
		g.drawImage(tex.enemy, (int) x, (int) y ,null);
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x,(int)y,32,32);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y=y;
		
	}

}