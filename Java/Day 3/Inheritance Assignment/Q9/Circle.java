public class Circle extends Shape{
	private int radius;
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public Circle() {
		super();
		System.out.println("Inside default constructor of Circle class.");
	}

	void draw() {
		System.out.println("Radius of circle is = " + radius);
	}
}
