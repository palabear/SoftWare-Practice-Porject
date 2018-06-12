package com.game.src.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;


public class Market {
	
	public Rectangle upgrade1 = new Rectangle(Game.WIDTH * Game.SCALE  - 120, 150,100,50) ;
	public Rectangle upgrade2 = new Rectangle(Game.WIDTH * Game.SCALE - 120, 250,100,50) ;
	public Rectangle upgrade3 = new Rectangle(Game.WIDTH * Game.SCALE - 120, 350,100,50) ;
	
	
	
	public void render(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;	
		
		g.setColor(Color.white);
		Font fnt1 = new Font("arial", Font.BOLD,20);
		g.setFont(fnt1);
		g.drawString("up1 = $10", upgrade1.x + 4,upgrade1.y + 30);
		//System.out.println(upgrade1.x + 4);
		g2d.draw(upgrade1);
		g.drawString("up2 = $20", upgrade2.x + 4,upgrade2.y + 30);
		g2d.draw(upgrade2);
		g.drawString("up3 = $30", upgrade3.x + 4,upgrade3.y + 30);
		g2d.draw(upgrade3);
	}
}
