package _03_polymorphs;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;

import javax.imageio.ImageIO;

public class imageMorph extends Polymorph{
public static BufferedImage cartman;
	imageMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		try {
			cartman = ImageIO.read(this.getClass().getResourceAsStream("wizard.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(cartman, getX(), getY(), null);
	}
	public void update() {
		
	}
}
