package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    circleMorph c = new circleMorph(450,300);
    ArrayList<Polymorph> polymorphs = new ArrayList<Polymorph>();
    buttonMorph trigger = new buttonMorph(125, 125);
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.add(trigger.button);
   	 window.setVisible(true);
   	polymorphs.add(new imageMorph(55,55));
   	 polymorphs.add(new BluePolymorph(50, 50));
	 polymorphs.add(new RedMorph(25, 25));
	 polymorphs.add(new MovingMorph(75,75));
     polymorphs.add(new mousePolymorph(25,25));
     polymorphs.add(trigger);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	 for(Polymorph p : polymorphs) {
   		 p.draw(g);
   		 p.update();
   	 }
 	 c.draw(g);
 	 c.Update();
   	 //draw polymorph
   	
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 
   	 
    }
}
