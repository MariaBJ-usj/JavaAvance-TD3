package model;

import java.util.ArrayList;

public class Point {
	private int x, y;
	
	public void Cartesan() {
		//Point p=new Point();
		//System.out.print(p.x+" "+p.y);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Point(Point p2) {
		this.x=p2.getX();
		this.y=p2.getY();
	}
	
	@Override
	public String toString() {
		return "("+this.x+", "+this.y+")";
	}
	
	public static void main(String[] args) {
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		
		//System.out.println(p1==p2);
		//System.out.println(p1==p3);
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));

	}
	

	public void isSameAs(Point p) {
		System.out.println(this.x==p.getX() && this.y==p.getY());
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Point p = (Point) obj;
		return this.x==p.getX() && this.y==p.getY();
	}
	
	public void translate(int dx, int dy) {
		this.x+=dx;
		this.y+=dy;
	}
	
	public void move(int dx, int dy) {
		this.x=dx;
		this.y=dy;
	}
}
