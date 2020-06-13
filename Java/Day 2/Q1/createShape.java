/*1)create a class "Shape" with 2 attributes, "width" and "height". Make sure one can not access these attributes directly.
provide accessor methods on these attributes and allow them to call from outside of your class.*/

class Shape
{
	private int width, height;
	public Shape(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	public int getWidth()
	{
		return this.width;
	}
	public int getHeight()
	{
		return this.height;
	}
}

public class createShape
{	
	public static void main(String[] args)
	{
		Shape s1 = new Shape(100,50);
		System.out.println("Height = " + s1.getHeight() + ", Width = " + s1.getWidth());
	}
}