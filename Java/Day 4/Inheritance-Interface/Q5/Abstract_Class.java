/*
 * 5) create abstract class Shape. declare "draw()" function as abstract. From this class define "Triangle","Polygon" and "Circle" .
 * create an array of Shape having 3 elements.
 * store child objects into this array and call their draw function.
 */
public class Abstract_Class {
	
	public static void main(String[] args) {
		Shape shp[] = {new Triangle(), new Polygon(), new Circle()};
		
		for (int i = 0; i < shp.length; i++) {
			shp[i].draw();
		}
	}
}
