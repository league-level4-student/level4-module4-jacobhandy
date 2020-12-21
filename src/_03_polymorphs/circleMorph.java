package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class circleMorph extends Polymorph{

	circleMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	double angle = 5.0;
	int xCenter = 450;
	int yCenter = 300;
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLACK);
		g.fillRect(getX(), getY(), 50, 50);
		angle++;
		//xCenter++;
		//yCenter++;
		setX((int) (Math.cos(angle) * 25+ xCenter));
		setY((int) (Math.sin(angle) * 25+ yCenter));
		
	}
	public void Update() {
		
	}
}
