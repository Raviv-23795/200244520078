
public class Polygon extends Shape{
	private int side1, side2, side3, side4, side5;

	public Polygon(int side1, int side2, int side3, int side4, int side5) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
		this.side5 = side5;
	}
	
	void draw() {
		System.out.println("Sides of the polygon are " + side1 + ", " + side2 + ", " + side3 + ", " + side4 + ", " + side5);
	}
}
