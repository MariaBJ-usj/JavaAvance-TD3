package view;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

import controller.MouseController;
import model.Circle;
import model.Point;
import model.Shape;

public class ShapeDisplay extends JPanel implements MouseMotionListener{
	
	//private static MouseController mc;
	protected Point p = new Point(50, 50);
	protected Shape shape = new Circle(p, 200);
	
	
	public void init() {
		this.addMouseMotionListener(this);
	}
	
	public Shape getShape() {
		return shape;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g1 = (Graphics2D) g;
		shape.draw(g1);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int x ,y;
	    x=e.getX();
	    y=e.getY();
	    shape.move(x, y);
	    this.paint(getGraphics());
	}
	
}
