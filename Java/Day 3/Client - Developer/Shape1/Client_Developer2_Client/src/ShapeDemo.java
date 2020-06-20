import devpack.Circle;
import devpack.Rectangle;
import devpack.Shape;
import devpack.Triangle;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape[] = {new Circle(), new Rectangle(), new Triangle()};
		for (int i = 0; i < shape.length; i++) {
			shape[i].draw();
		}
	}

}
