package model;

import java.awt.Graphics2D;

public interface Shape {
	public void resize();
	public double area();
	public void draw(Graphics2D g);
	public void move(int x, int y);
}
