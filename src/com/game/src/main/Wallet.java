package com.game.src.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Wallet {
	
	//private Texture tex;
	Game game;	
	
	Wallet(Game game){		
		this.game = game;
		
	}
	
	
	public void buy(int price,Graphics g) {
		if(price > game.MONEY) {
			
		} else {
			game.MONEY -= price;			
		}			
		
	}
	
		
	String Show_money() {
		String string_money = String.valueOf(Game.MONEY);
		return string_money;
	}
	
	
	
	public void render(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		Font fnt0 = new Font("arial", Font.BOLD, 50);
		g.setFont(fnt0);
		g.setColor(Color.white);
		g.drawString(Show_money(), 10, 30);
				
	}



}
