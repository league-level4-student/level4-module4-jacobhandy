package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;

public class mousePolymorph extends Polymorph{
	mousePolymorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.CYAN);
		g.fillRect(getX(), getY(), 50, 50);
		
	}
	public void update() {
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		float X = (float) b.getX();
		float Y = (float) b.getY();
		setX((int)X);
		setY((int)Y);
	}
}
