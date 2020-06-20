import devpack.Circle;
import devpack.Rectangle;
import devpack.Shape;
import devpack.Triangle;

public class ShapeDemo {

	public static void perform(Shape shape) {
		shape.draw();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform(new Triangle());
		perform(new Rectangle());
		perform(new Circle());
	}

}
