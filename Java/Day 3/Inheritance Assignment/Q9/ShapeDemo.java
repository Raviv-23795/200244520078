/*
 * 9)	Define a class “Shape” with “draw()” function. Now derive classes like “Circle”, “Polygon”, “Rectangle” etc. from “Shape” and override “draw()” function. Define a class “ShapeDemo” in which write main()  function. In the main function create a reference to Shape class referring to any of the sub class. Using this reference, call “draw()” and check the result.
 */
public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape r1 = new Rectangle(10, 20);
		r1.draw();
		
		r1 = new Circle(30);
		r1.draw();
		
		r1 = new Polygon(10, 20, 30, 40, 50);
		r1.draw();
	}

}
