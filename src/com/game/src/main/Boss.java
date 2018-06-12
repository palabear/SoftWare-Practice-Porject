package com.game.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityB;

public class Boss extends GameObject implements EntityB {
	
Random r =new Random();
	
	private int speed = 1; 
	
	private Texture tex;
	private Game game;
	private Controller c;
	private Wallet w;
	
	
	public Boss(double x, double y, Texture tex,Controller c, Game game,Wallet w) {
	    super(x,y);
		this.tex = tex;
		this.c = c;
		this.game = game;
		this.w=w;
		
	}
	
	public void tick() {
		y+=speed;	
		
		if(y>(Game.HEIGHT * Game.SCALE)) {
			y= -3;
			x = 0;
			//레벨 1로 되돌리기
			
		}
		
		for(int i =0 ; i< game.ea.size(); i++)
		{
			
			EntityA tempEnt = game.ea.get(i);		
		
		if(Physics.Collision(this, tempEnt))
		{
			game.HIT++;
			c.removeEntity(tempEnt);
			if(game.Boss_HP == game.HIT) {				
				c.removeEntity(this);
				Game.MONEY += game.LEVEL * 100;
				game.stage_clear = true ;
				game.Boss_HP *= game.LEVEL;
				game.HIT = 0;
			}			
			
			
			}
		}
		
	}
	
	public void render(Graphics g) {
		g.drawImage(tex.Boss, (int) x, (int) y ,null);
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x,(int)y,600,400);
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
