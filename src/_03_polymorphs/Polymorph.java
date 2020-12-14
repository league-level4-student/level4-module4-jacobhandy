package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    
    private int width;
    private int height;
    
    Polymorph(int x, int y){
   	 this.setX(x);
   	 this.setY(y);
    }
    
    public void update(){
   	int speed = 10;
    	setX(getX() + speed);
    }
    
    public abstract void draw(Graphics g);

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
