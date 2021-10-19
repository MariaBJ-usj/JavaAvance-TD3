package model;

public class Ring extends Circle implements Shape{

	private double innerRadius;

	public Ring(Point p, int r, int innerR) {
		super(p, r);
		if (innerR<r) {
			this.innerRadius=innerR;
		}else{
			System.out.println("Inner Radius should be smaller than the radius");
		}	
	}

	@Override
	public boolean equals(Object obj) {
		Ring ring = (Ring) obj;
		return this.innerRadius==ring.innerRadius && super.equals(ring);
	}
	
	public static void main(String[] args) {
		Point p = new Point(1,2);
		Ring ring = new Ring(p, 2, 1);
		System.out.println(ring);
	}
	
	public boolean contains(Point p) {
		return super.contains(p);
	}
	
	public boolean contains(Point p, Ring[] rings) {
		return super.contains(p, rings);
	}
}
