
public class Rectangle extends Shape {
	private int height, width;

	public Rectangle(int height, int width) {
		super();
		System.out.println("Inside default constructor of Rectangle class.");
		this.height = height;
		this.width = width;
	}
	
	void draw()
	{
		System.out.println("Height of rectangle is " + height + " and width is " + width);
	}
}
