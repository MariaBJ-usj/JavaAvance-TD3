package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circle implements Shape{
	private Point center;
	private double radius;

	public Circle(Point p, int r) {
		center=new Point(p.getX(), p.getY());
		radius=r;
	}

	@Override
	public double area() {
		return (Math.PI*(Math.pow(radius, 2)));
	}

	@Override
	public String toString() {
		return "Circle center: "+this.center+", Circle radius: "+this.radius+", Circle area: "+this.area();
	}

	public void translate(int dx, int dy) {
		center.translate(dx, dy);
	}


	public boolean contains(Point p) {
		double distance = Math.pow(p.getX(), 2)+Math.pow(p.getY(), 2);
		double rSquare=Math.pow(this.radius, 2);
		if (distance<=rSquare) {
			return true;
		}
		return false;	
	}


	public boolean contains(Point p, Circle[] circles) {
		for (Circle circle : circles) {
			double distance = Math.pow(p.getX(), 2)+Math.pow(p.getY(), 2);
			double rSquare=Math.pow(circle.radius, 2);
			if (distance<=rSquare) {
				return true;
			}
		}
		return false;	
	}

	@Override
	public boolean equals(Object obj) {
		Circle c = (Circle) obj;
		return this.center==c.center && this.radius==c.radius;
	}

	@Override
	public void move(int x, int y) {
		center.move(x, y);
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics2D g) {
		Ellipse2D circle = new Ellipse2D.Double((double) center.getX(), (double)center.getY(), 
				(double)this.radius, (double)this.radius);
		g.draw(circle);
	}

}
