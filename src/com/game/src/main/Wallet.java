package com.game.src.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import com.game.src.main.classes.EntityB;

public class Wallet {
	
	//private Texture tex;
	private int Money;
	
	Wallet(){
		this.Money = 0;
	}
	
	
	public void set_Money(int money) {
		this.Money = money;
	}
	
	public int AmountMoney() {
		return Money;
	}
	
	String Show_money() {
		String string_money = String.valueOf(AmountMoney());
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
