package com.game.src.main;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;



public class MouseInput implements MouseListener {
	private Wallet w;
	private Graphics g;
	
	MouseInput(Wallet w){
		this.w = w;
				
	}

	
	public void mousePressed(MouseEvent e) {
		
		int mx = e.getX();
		int my = e.getY();
		/**
		 * public Rectangle playButton = new Rectangle(Game.WIDTH/2 + 120, 150,100,50) ;
		 * public Rectangle helpButton = new Rectangle(Game.WIDTH/2 + 120, 250,100,50) ;
		 * public Rectangle quitButton = new Rectangle(Game.WIDTH/2 + 120, 350,100,50) ;
		 * 
		 */
		//play
		if (mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 + 220) {
			if (my >= 150 && my <= 200) {
				// pressed play button
				Game.state = Game.STATE.GAME;
			}
		}
		//quit
		if (mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 + 220) {
			if (my >= 350 && my <= 400) {
				// pressed play button
				System.exit(1);
			}
		}
		//up1
		/**
		 * public Rectangle upgrade1 = new Rectangle(Game.WIDTH * Game.SCALE  - 120, 150,100,50) ;
		public Rectangle upgrade2 = new Rectangle(Game.WIDTH * Game.SCALE - 120, 250,100,50) ;
		public Rectangle upgrade3 = new Rectangle(Game.WIDTH * Game.SCALE - 120, 350,100,50) ;
		 */
		if (mx >= Game.WIDTH * Game.SCALE  - 120 && mx <= Game.WIDTH * Game.SCALE  - 20) {
			if (my >= 150 && my <= 200) {
				// pressed play up1 button
				System.out.println("upgrade 1\n");
				w.buy(10, g);
				
			}
		}
		
		//up2
		if (mx >= Game.WIDTH * Game.SCALE  - 120 && mx <= Game.WIDTH * Game.SCALE  - 20) {
			if (my >= 250 && my <= 300) {
				// pressed up2 button
				System.out.println("upgrade 2\n");
				
			}
		}
		
		//up3
		if (mx >= Game.WIDTH * Game.SCALE  - 120 && mx <= Game.WIDTH * Game.SCALE  - 20) {
			if (my >= 350 && my <= 400) {
				// pressed up3 button
				System.out.println("upgrade 3\n");
			}
		}
		
		
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	
}
