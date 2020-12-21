package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class buttonMorph extends Polymorph implements ActionListener {

	buttonMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	Rectangle r;
	JButton button = new JButton("Click");
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.MAGENTA);
		r = new Rectangle();
		r.setSize(50,50);
		r.setLocation(getX(),getY());
		g.fillRect(getX(), getY(), 50, 50);
		button.addActionListener(this);
		button.setLocation(getX(), getY());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			System.out.println("e");
		}
	}

	

}
